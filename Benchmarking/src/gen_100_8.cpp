  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<double> f44(const std::vector<double> &v0) {
    std::vector<double> v7 = v0;
    std::vector<double> v4 = v0;
    std::vector<double> v3 = v4;
    const double v5 = v7[0];
    const double v1 = v7[0];
    v4 = v7;
    const double v2 = v7[0];
    const double v12 = v5 * v1;
    v3[0] = v2;
    double v11 = v12;
    v3 = v0;
    double v14 = v5;
    double v18 = v1;
    double v13 = v11;
    v3[0] = v13;
    v3 = v4;
    v3[0] = v13;
    v13 = v18;
    v7[0] = v12;
    std::vector<double> v27 = v3;
    v27[0] = v11;
    v27[0] = v14;
    v3[0] = v12;
    std::vector<double> v37 = v27;
    return v37;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<double> v5 = v0[2];
    const std::vector<double> v16 { v1 };
    const double v12 = v5[0];
    const std::vector<double> v17 = f44(v5);
    const double v14 = v16[0];
    std::vector<double> v28 = v17;
    v28[0] = v12;
    const double v58 = v28[0];
    v28[0] = v14;
    return v58;
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
