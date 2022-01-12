  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<double> f71(const std::vector<double> &v0) {
    const double v6 = v0[0];
    double v2 = v6;
    double v7 = v6;
    double v8 = v7;
    std::vector<double> v15 = v0;
    std::vector<double> v9 = v15;
    v9[0] = v2;
    v9[0] = v8;
    v15[0] = v6;
    std::vector<double> v76 = v9;
    return v76;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<double> v3 = v0[0];
    const std::vector<double> v11 = f71(v3);
    const double v12 = v3[0];
    const double v10 = v11[0];
    double v27 = v10;
    double v23 = v12;
    const double v25 = v27 - v23;
    v23 = v27;
    double v220 = v25;
    return v220;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    double v1(1.0);
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
