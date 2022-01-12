  #include <vector>
  #include <iostream>
  #include <chrono>
  double f46(const double &v0) {
    double v1 = v0;
    v1 = v0;
    double v3 = v0;
    double v5 = v0;
    double v8 = v1;
    double v2 = v3;
    double v7 = v2;
    const std::vector<double> v6 { v1, v3, v7 };
    const double v9 = v6[1];
    double v17 = v3;
    const double v15 = v17 + v8;
    const std::vector<double> v18 { v9, v8, v1, v8, v5 };
    const double v26 = v18[4];
    std::vector<double> v24 = v18;
    v24[0] = v7;
    const double v52 = v6[1];
    v24[3] = v52;
    v24[4] = v26;
    v24[2] = v1;
    v24[4] = v15;
    std::vector<double> v38 = v18;
    v38 = v24;
    std::vector<double> v75 = v38;
    const double v81 = v75[2];
    return v81;
  }
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1) {
    std::vector<double> v6 = v0;
    v6[0] = v1;
    const double v5 = v6[0];
    const double v9 = f46(v5);
    const double v7 = v0[0];
    const double v2 = v0[0];
    const double v14 = v6[0];
    std::vector<double> v11 = v6;
    const double v22 = f46(v14);
    std::vector<double> v26 = v11;
    const double v20 = f46(v7);
    std::vector<double> v18 = v11;
    const double v25 = v26[0];
    const double v32 = v26[0];
    v11[0] = v14;
    std::vector<double> v31 = v0;
    v18[0] = v25;
    std::vector<double> v43 = v18;
    const double v19 = v31[0];
    const double v41 = f46(v5);
    std::vector<double> v56 = v43;
    const double v51 = f46(v22);
    std::vector<double> v28 = v6;
    v11[0] = v41;
    v28[0] = v2;
    v6[0] = v22;
    std::vector<double> v33 = v56;
    const double v44 = f46(v19);
    v11[0] = v20;
    v56[0] = v25;
    const std::vector<std::vector<double>> v34 { v33, v18 };
    const std::vector<std::vector<std::vector<double>>> v108 { v34, v34, v34 };
    std::vector<double> v63 = v0;
    v11 = v63;
    const std::vector<std::vector<double>> v86 = v108[0];
    std::vector<std::vector<double>> v79 = v86;
    v6[0] = v51;
    const std::vector<double> v113 = v79[0];
    const double v66 = v113[0];
    const double v128 = f46(v32);
    const double v176 = f46(v44);
    std::vector<double> v88 = v63;
    v18[0] = v1;
    const double v127 = f46(v66);
    v18 = v88;
    const double v102 = f46(v176);
    v88[0] = v102;
    v18[0] = v128;
    v63[0] = v9;
    v11 = v28;
    return v127;
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
