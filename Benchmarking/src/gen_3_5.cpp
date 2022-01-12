  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f5(const std::vector<std::vector<double>> &v0) {
    return v0;
  }
  std::vector<std::vector<double>> f4(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v2 = v0[0];
    std::vector<double> v1 = v2;
    const std::vector<double> v3 = v0[0];
    std::vector<std::vector<double>> v28 = v0;
    std::vector<std::vector<double>> v24 = v0;
    std::vector<std::vector<double>> v21 = v24;
    std::vector<std::vector<double>> v23 = v24;
    v21[0] = v1;
    std::vector<double> v32 = v3;
    const std::vector<std::vector<std::vector<double>>> v39 { v23, v24, v21, v21, v28, v28 };
    v21[0] = v32;
    const std::vector<std::vector<double>> v57 = v39[3];
    return v57;
  }
  double f3(const double &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2) {
    const std::vector<double> v4 = v2[0];
    std::vector<double> v23 = v4;
    v23[0] = v0;
    const double v16 = v4[0];
    double v20 = v16;
    const double v46 = v0 + v20;
    double v42 = v0;
    const double v24 = v4[0];
    const std::vector<double> v102 { v20, v46, v42 };
    const double v83 = v102[2];
    const double v107 = v23[0];
    const double v179 = v83 * v24;
    v20 = v107;
    return v179;
  }
  std::vector<std::vector<double>> f2(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v10 = f5(v0);
    const std::vector<std::vector<double>> v30 = f5(v10);
    const std::vector<std::vector<double>> v25 = f5(v30);
    std::vector<std::vector<double>> v38 = v25;
    const std::vector<std::vector<double>> v43 = f5(v38);
    const std::vector<std::vector<std::vector<double>>> v114 { v43 };
    std::vector<std::vector<std::vector<double>>> v45 = v114;
    const std::vector<std::vector<double>> v62 = v45[0];
    const std::vector<std::vector<double>> v145 = f5(v62);
    return v145;
  }
  std::vector<std::vector<double>> f1(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2) {
    const std::vector<std::vector<double>> v8 = f4(v2);
    const std::vector<double> v4 = v1[2];
    const std::vector<std::vector<double>> v7 = f5(v0);
    std::vector<std::vector<double>> v5 = v1;
    const std::vector<std::vector<double>> v10 = f2(v7);
    const std::vector<double> v18 = v10[1];
    const std::vector<std::vector<double>> v13 = f5(v10);
    const std::vector<double> v30 = v8[0];
    const std::vector<double> v16 = v13[0];
    v5[2] = v4;
    std::vector<std::vector<double>> v21 = v1;
    v21[0] = v16;
    const std::vector<double> v53 = v7[0];
    v21[0] = v4;
    v21[1] = v30;
    const std::vector<std::vector<std::vector<double>>> v28 { v21, v5 };
    v21[2] = v53;
    const std::vector<std::vector<double>> v37 = v28[0];
    const std::vector<double> v79 = v37[0];
    std::vector<std::vector<double>> v62 = v2;
    v62[0] = v18;
    std::vector<std::vector<double>> v111 = v62;
    const std::vector<std::vector<double>> v57 = v28[0];
    const std::vector<double> v76 = v57[1];
    v62[0] = v79;
    v5[1] = v76;
    return v111;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    const double v7 = v3 / v3;
    std::vector<std::vector<double>> v6 = v1;
    const std::vector<std::vector<double>> v9 = f1(v0, v2, v1);
    const double v10 = f3(v7, v0, v1);
    const std::vector<double> v15 = v9[0];
    const std::vector<std::vector<double>> v11 = f4(v6);
    v6[0] = v15;
    const double v8 = f3(v10, v0, v6);
    const std::vector<std::vector<double>> v12 = f5(v0);
    const double v35 = v8 - v7;
    const double v38 = f3(v35, v12, v11);
    return v38;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    std::vector<std::vector<double>> v1({ { 2.0 } });
    std::vector<std::vector<double>> v2({ { 3.0 }, { 4.0 }, { 5.0 } });
    double v3(6.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
