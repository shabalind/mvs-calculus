  #include <vector>
  #include <iostream>
  #include <chrono>
  double f103(const double &v0) {
    double v3 = v0;
    double v4 = v0;
    const double v5 = v3 + v4;
    const std::vector<double> v9 { v0, v0 };
    std::vector<double> v2 = v9;
    const double v11 = v9[1];
    const double v13 = v9[0];
    v2[1] = v11;
    v2[0] = v13;
    std::vector<double> v14 = v2;
    v14[1] = v5;
    v14[0] = v11;
    v14[1] = v13;
    std::vector<double> v18 = v14;
    const double v53 = v18[0];
    return v53;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<double> v2 = v0[1];
    const double v4 = v1 - v1;
    const double v3 = v4 + v4;
    const double v11 = v2[0];
    const double v7 = f103(v11);
    std::vector<double> v13 = v2;
    const std::vector<double> v16 = v0[1];
    v13[0] = v4;
    v13[0] = v3;
    std::vector<double> v18 = v13;
    v13[0] = v7;
    const double v26 = v16[0];
    v13 = v18;
    std::vector<double> v47 = v13;
    v47[0] = v26;
    const double v108 = v47[0];
    return v108;
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
