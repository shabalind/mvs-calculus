  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1) {
    std::vector<double> v2 = v0;
    const std::vector<double> v6 { v1, v1, v1, v1, v1, v1 };
    const double v13 = v6[5];
    const double v5 = v2[0];
    double v9 = v13;
    std::vector<double> v8 = v6;
    std::vector<double> v18 = v8;
    std::vector<double> v12 = v8;
    const double v17 = v8[1];
    v12[0] = v5;
    double v21 = v17;
    std::vector<double> v16 = v12;
    const double v42 = v0[1];
    const double v26 = v16[0];
    std::vector<double> v27 = v12;
    const double v29 = v26 / v21;
    std::vector<double> v47 = v27;
    double v30 = v5;
    v12[3] = v9;
    std::vector<double> v39 = v18;
    const double v31 = v27[4];
    v8[4] = v31;
    double v41 = v9;
    v16[2] = v41;
    std::vector<double> v150 = v6;
    v16 = v150;
    v12[2] = v5;
    v150[3] = v42;
    v12[1] = v30;
    const double v192 = v47[2];
    const double v134 = v39[5];
    v30 = v134;
    v12[2] = v192;
    v8[5] = v41;
    return v29;
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
