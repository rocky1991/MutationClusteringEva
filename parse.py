import numpy as np
np.set_printoptions(threshold=np.inf)


class muJ_parser:
	def __init__(self):
		self.out_arr = [[]]
		self.id_arr = [""]
	def parse(self,file_path,num_testcases):
		with open (file_path,'r') as file:
			mutant_report = file.readlines()[-1]

		mutant_report = (mutant_report.split(":")[1])
		brace_1 = mutant_report.find("{")
		brace_2 = mutant_report.find("}")
		mutant_report = mutant_report[brace_1+1:brace_2].split("=")
		
		
		n = len(mutant_report)-1
		self.id_arr = [""]*n
		test_arr = np.zeros((n,num_testcases))
		test_index = 0
		i = 0
		for item in mutant_report:
			if(i < n):
				self.id_arr[i] = item.split(",")[-1].strip()
			i+= 1
		i = 0

		for item in mutant_report[1:]:
			temp = item.strip(" ").split(",")

			for test in temp:

				if(test!=""):
					if(test.strip()[0]=='t'):
						test_index = int(test.replace("testCase",""))
						test_arr[i][test_index-1] = 1			
				else:
					test_arr[i,:] = np.zeros((1,num_testcases))
			i+= 1
		self.out_arr = test_arr.astype(int)

	def write_to_file(self):
		with open('test_result/test_result.txt','w') as file:
			file.write("")

		with open('test_result/test_result.txt','a') as file:
			for arr in self.out_arr:
				file.write(str(arr.tolist()).strip("[]\n") + "\n")

		with open('test_result/ids.txt','w') as file:
			file.write("")
		with open('test_result/ids.txt','a') as file:
			for arr in self.id_arr:
				file.write(str(arr).strip()+"\n")

def main():
	print("Enter number of test cases>>> " )
	num_testcases = int(input())

	myparser = muJ_parser()
	myparser.parse('output.txt',num_testcases)
	myparser.write_to_file()
	
if __name__=="__main__":
	main()
