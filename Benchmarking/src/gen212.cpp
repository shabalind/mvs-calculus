  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<double> v7 = v0[1];
    double v3 = v1;
    const std::vector<double> v4 = v0[0];
    const std::vector<double> v8 = v0[1];
    std::vector<double> v15 = v7;
    const std::vector<double> v9 = v0[1];
    const std::vector<std::vector<double>> v13 { v8, v7, v9, v4, v8, v15 };
    const std::vector<double> v11 = v0[0];
    v15[0] = v3;
    const std::vector<double> v6 = v0[1];
    const std::vector<double> v18 = v0[0];
    std::vector<std::vector<double>> v14 = v13;
    const double v16 = v6[0];
    v15[0] = v16;
    v14 = v13;
    v14[0] = v6;
    const std::vector<double> v30 = v0[1];
    v14[0] = v18;
    v15[0] = v16;
    v14[0] = v11;
    const double v39 = v30[0];
    v15[0] = v39;
    const std::vector<double> v41 = v14[3];
    const double v219 = v41[0];
    return v219;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    double v1(2.0);
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
