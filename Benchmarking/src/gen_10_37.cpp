  #include <vector>
  #include <iostream>
  #include <chrono>
  double f84(const double &v0) {
    double v1 = v0;
    double v2 = v1;
    double v4 = v2;
    double v7 = v1;
    double v3 = v0;
    double v13 = v7;
    double v11 = v1;
    double v8 = v0;
    double v6 = v13;
    double v10 = v7;
    const std::vector<double> v17 { v13, v4, v10, v3, v10 };
    std::vector<double> v25 = v17;
    double v26 = v0;
    v25[4] = v6;
    std::vector<double> v21 = v17;
    v25[1] = v8;
    const double v27 = v21[0];
    v25[2] = v11;
    std::vector<double> v71 = v25;
    v25[4] = v26;
    std::vector<double> v30 = v71;
    double v70 = v26;
    const double v34 = v30[3];
    v21[2] = v70;
    v71[3] = v27;
    v71[0] = v27;
    v25[2] = v70;
    v30[2] = v7;
    v21[2] = v1;
    v21[1] = v27;
    return v34;
  }
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1) {
    double v6 = v1;
    const double v2 = f84(v1);
    const double v5 = v0[0];
    const double v3 = v2 * v6;
    const double v9 = v0[0];
    const double v7 = f84(v1);
    const double v16 = f84(v7);
    double v11 = v5;
    const double v22 = v0[0];
    const double v18 = f84(v22);
    const double v10 = f84(v9);
    const double v51 = v0[0];
    const double v24 = v0[0];
    std::vector<double> v23 = v0;
    v23[0] = v24;
    const std::vector<double> v15 { v18, v10, v6, v18, v16, v11 };
    v23[0] = v51;
    const double v26 = v15[3];
    const double v25 = f84(v7);
    std::vector<double> v34 = v23;
    v34[0] = v10;
    std::vector<double> v65 = v23;
    std::vector<double> v81 = v65;
    v81 = v65;
    v81 = v34;
    v23 = v0;
    v65[0] = v26;
    const double v121 = v81[0];
    const double v100 = f84(v25);
    v81 = v65;
    double v114 = v100;
    v34[0] = v3;
    v34[0] = v114;
    return v121;
  }
  int main() {
    std::vector<double> v0({ 0.0 });
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
