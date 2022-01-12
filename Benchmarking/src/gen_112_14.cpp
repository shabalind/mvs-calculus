  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    std::vector<std::vector<double>> v3 = v0;
    std::vector<std::vector<double>> v4 = v3;
    std::vector<std::vector<double>> v6 = v3;
    const std::vector<double> v13 = v4[1];
    v3[2] = v13;
    std::vector<double> v14 = v13;
    v6[2] = v13;
    const std::vector<std::vector<std::vector<double>>> v11 { v3 };
    v6[2] = v14;
    const std::vector<std::vector<double>> v16 = v11[0];
    std::vector<std::vector<double>> v24 = v6;
    const std::vector<double> v19 = v16[0];
    double v26 = v1;
    v4[2] = v19;
    const std::vector<double> v81 = v24[1];
    v3[2] = v19;
    v6[2] = v81;
    v3[2] = v13;
    const double v85 = v81[0];
    v14[0] = v26;
    return v85;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    double v1(3.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
