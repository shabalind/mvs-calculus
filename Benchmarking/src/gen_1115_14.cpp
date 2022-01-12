  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<double> f72(const std::vector<double> &v0) {
    std::vector<double> v1 = v0;
    std::vector<double> v7 = v0;
    std::vector<double> v8 = v7;
    const double v3 = v8[0];
    const double v9 = v8[0];
    const double v4 = v3 + v3;
    const double v10 = v7[0];
    const double v11 = v1[0];
    const double v17 = v8[0];
    double v12 = v9;
    v8[0] = v12;
    v1[0] = v12;
    const std::vector<double> v6 { v4, v3, v4, v12, v17, v3, v10 };
    std::vector<double> v18 = v6;
    const double v13 = v18[4];
    std::vector<double> v25 = v7;
    std::vector<double> v21 = v25;
    std::vector<double> v32 = v21;
    v21[0] = v13;
    v18[0] = v4;
    v18[2] = v11;
    v8[0] = v11;
    std::vector<double> v119 = v32;
    std::vector<double> v201 = v119;
    v7[0] = v11;
    return v201;
  }
  __attribute__((noinline))
  double f0(const double &v0) {
    double v5 = v0;
    const std::vector<double> v7 { v5, v0 };
    double v4 = v0;
    const double v2 = v7[1];
    std::vector<double> v6 = v7;
    const double v8 = v6[1];
    std::vector<double> v10 = v7;
    const double v1 = v6[1];
    const double v21 = v6[1];
    v6[0] = v5;
    v10[0] = v21;
    const double v15 = v7[0];
    const double v14 = v5 - v1;
    std::vector<double> v12 = v10;
    v6[0] = v5;
    std::vector<double> v17 = v7;
    const double v24 = v12[0];
    std::vector<double> v28 = v17;
    v17 = v7;
    std::vector<double> v18 = v17;
    std::vector<double> v31 = v10;
    v6[1] = v5;
    double v27 = v15;
    v10[0] = v2;
    double v39 = v5;
    const double v35 = v10[1];
    v10[0] = v21;
    std::vector<double> v22 = v6;
    std::vector<double> v79 = v22;
    std::vector<double> v29 = v12;
    v29[1] = v24;
    const double v43 = v29[1];
    v79[0] = v4;
    double v46 = v27;
    double v26 = v27;
    const double v60 = v31[1];
    v18[0] = v14;
    v27 = v46;
    const double v41 = v12[1];
    std::vector<double> v38 = v79;
    const double v66 = v29[1];
    v79[1] = v60;
    std::vector<double> v56 = v17;
    const std::vector<std::vector<double>> v82 { v18, v29, v17, v28, v56, v38, v18 };
    v31[1] = v41;
    std::vector<double> v76 = v29;
    v17[1] = v43;
    std::vector<std::vector<double>> v25 = v82;
    v22[0] = v39;
    double v50 = v26;
    std::vector<std::vector<double>> v45 = v25;
    const std::vector<double> v69 = v45[0];
    const double v159 = v69[1];
    const std::vector<double> v163 { v159 };
    const std::vector<double> v129 = f72(v163);
    const double v166 = v129[0];
    v17[1] = v50;
    v25[5] = v76;
    v76[1] = v66;
    v12[0] = v8;
    v38[0] = v35;
    return v166;
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
