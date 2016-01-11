# @param {Integer[]} nums
# @return {Integer}
def single_number(nums)

	result = 0

    nums.each do |num|
    	result ^= num
    end

    result
end

puts single_number([1,2,1,2,3])