  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const double &v0) {
    const std::vector<double> v3 { v0 };
    const std::vector<std::vector<double>> v1 { v3, v3, v3, v3, v3, v3, v3 };
    std::vector<std::vector<double>> v12 = v1;
    v12[4] = v3;
    v12[6] = v3;
    const std::vector<std::vector<std::vector<double>>> v5 { v12 };
    v12[3] = v3;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v11 { v5, v5, v5, v5, v5 };
    v12[4] = v3;
    std::vector<std::vector<std::vector<std::vector<double>>>> v14 = v11;
    const std::vector<std::vector<std::vector<double>>> v17 = v11[3];
    const std::vector<std::vector<std::vector<double>>> v16 = v14[0];
    const std::vector<double> v21 = v12[6];
    v12[1] = v21;
    std::vector<std::vector<double>> v30 = v12;
    v12[0] = v21;
    v14[4] = v17;
    const std::vector<std::vector<double>> v54 = v16[0];
    std::vector<double> v89 = v21;
    const std::vector<double> v46 = v54[5];
    const std::vector<double> v50 = v30[5];
    v12[5] = v50;
    const double v96 = v46[0];
    std::vector<double> v104 = v89;
    v30[5] = v46;
    v30[2] = v104;
    return v96;
  }
  int main() {
    double v0(0.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
