  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1) {
    std::vector<double> v5 = v0;
    v5[1] = v1;
    v5[0] = v1;
    const double v2 = v5[1];
    std::vector<double> v6 = v0;
    const double v9 = v0[0];
    const double v7 = v0[0];
    v6[1] = v9;
    v6[0] = v9;
    v5[0] = v9;
    const std::vector<std::vector<double>> v10 { v6 };
    std::vector<std::vector<double>> v16 = v10;
    v6[1] = v7;
    std::vector<double> v11 = v6;
    std::vector<std::vector<double>> v22 = v16;
    v6[0] = v2;
    const std::vector<double> v14 = v16[0];
    v16[0] = v11;
    const std::vector<std::vector<std::vector<double>>> v25 { v22 };
    std::vector<std::vector<std::vector<double>>> v21 = v25;
    v22[0] = v14;
    v16[0] = v14;
    std::vector<double> v35 = v0;
    const std::vector<std::vector<double>> v49 = v21[0];
    v21[0] = v22;
    const double v38 = v0[1];
    std::vector<double> v42 = v35;
    const std::vector<double> v46 = v49[0];
    v22[0] = v11;
    double v71 = v2;
    v22[0] = v42;
    v6[1] = v38;
    std::vector<double> v57 = v46;
    v42[0] = v71;
    v5[1] = v38;
    v35[0] = v71;
    const double v64 = v57[1];
    return v64;
  }
  int main() {
    std::vector<double> v0({ 0.0, 1.0 });
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
