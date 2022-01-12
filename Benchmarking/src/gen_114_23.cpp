  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<double> f40(const std::vector<double> &v0) {
    const double v6 = v0[2];
    const double v7 = v0[2];
    const double v3 = v0[2];
    std::vector<double> v5 = v0;
    std::vector<double> v14 = v5;
    v5[0] = v3;
    v5[1] = v3;
    double v17 = v7;
    v5[2] = v17;
    v14[2] = v6;
    std::vector<double> v50 = v14;
    return v50;
  }
  __attribute__((noinline))
  double f0(const double &v0) {
    double v6 = v0;
    double v2 = v6;
    double v4 = v0;
    double v7 = v2;
    double v3 = v7;
    double v1 = v7;
    double v13 = v4;
    double v11 = v7;
    const double v9 = v11 * v6;
    double v10 = v7;
    double v14 = v4;
    double v18 = v3;
    const double v17 = v14 + v2;
    const std::vector<double> v25 { v0, v11, v13 };
    const std::vector<double> v19 = f40(v25);
    std::vector<double> v16 = v19;
    const std::vector<double> v38 = f40(v19);
    const double v12 = v2 * v9;
    v4 = v18;
    v16[0] = v12;
    const double v24 = v16[1];
    v4 = v0;
    const std::vector<double> v20 = f40(v38);
    const std::vector<double> v44 = f40(v38);
    std::vector<double> v57 = v20;
    const std::vector<double> v40 = f40(v38);
    const std::vector<double> v51 = f40(v57);
    v14 = v7;
    const std::vector<double> v34 = f40(v44);
    v57[2] = v1;
    const std::vector<double> v31 = f40(v51);
    const std::vector<double> v93 = f40(v31);
    double v64 = v24;
    v57[2] = v17;
    const double v84 = v93[1];
    double v69 = v11;
    v64 = v11;
    const double v98 = v34[2];
    const double v97 = v40[0];
    const std::vector<double> v151 { v13, v84, v69, v97, v10, v64 };
    v16 = v38;
    std::vector<double> v178 = v151;
    v13 = v11;
    const double v122 = v178[3];
    v16[1] = v98;
    return v122;
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
