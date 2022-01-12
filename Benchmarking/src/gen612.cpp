  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f7(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v6 = v0;
    const std::vector<std::vector<std::vector<double>>> v4 { v0, v6, v6, v0, v6, v0, v6 };
    const std::vector<std::vector<double>> v3 = v4[3];
    const std::vector<std::vector<double>> v7 = v4[2];
    std::vector<std::vector<std::vector<double>>> v1 = v4;
    const std::vector<std::vector<double>> v5 = v4[4];
    const std::vector<std::vector<double>> v2 = v4[2];
    std::vector<std::vector<std::vector<double>>> v15 = v1;
    const std::vector<std::vector<double>> v10 = v4[6];
    std::vector<std::vector<std::vector<double>>> v14 = v1;
    const std::vector<double> v20 = v6[1];
    std::vector<std::vector<double>> v12 = v6;
    std::vector<std::vector<std::vector<double>>> v19 = v1;
    std::vector<std::vector<double>> v29 = v3;
    std::vector<std::vector<std::vector<double>>> v28 = v15;
    v12[2] = v20;
    const std::vector<std::vector<double>> v42 = v19[4];
    const std::vector<std::vector<double>> v27 = v4[4];
    const std::vector<double> v50 = v10[1];
    v1[3] = v29;
    v12[1] = v50;
    const double v34 = v50[0];
    const std::vector<std::vector<double>> v57 = v4[2];
    std::vector<double> v43 = v50;
    v1[5] = v5;
    v19[0] = v2;
    v15[6] = v7;
    v14[6] = v57;
    const std::vector<double> v93 = v10[0];
    const std::vector<std::vector<double>> v83 = v19[6];
    std::vector<double> v56 = v93;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v74 { v14, v14, v1, v28, v15 };
    v15[4] = v12;
    v12[1] = v93;
    const std::vector<std::vector<std::vector<double>>> v98 = v74[3];
    v14[0] = v42;
    v12[0] = v56;
    v43 = v50;
    v19[4] = v83;
    v56[0] = v34;
    const std::vector<std::vector<double>> v181 = v98[1];
    v12[2] = v43;
    v6 = v27;
    v14[4] = v57;
    return v181;
  }
  std::vector<std::vector<double>> f4(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<double> v8 = v0[2];
    std::vector<std::vector<double>> v13 = v0;
    std::vector<std::vector<double>> v10 = v13;
    const std::vector<std::vector<double>> v11 = f7(v1);
    const std::vector<std::vector<double>> v20 = f7(v11);
    std::vector<std::vector<double>> v34 = v13;
    const std::vector<std::vector<std::vector<double>>> v66 { v10, v20, v20, v1, v13 };
    std::vector<std::vector<std::vector<double>>> v30 = v66;
    v30[4] = v34;
    const std::vector<std::vector<double>> v64 = v30[1];
    v34[0] = v8;
    return v64;
  }
  std::vector<std::vector<double>> f2(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v4 = v0;
    const std::vector<std::vector<double>> v10 = f7(v4);
    const std::vector<std::vector<double>> v11 = f4(v4, v10);
    const std::vector<std::vector<double>> v1 = f7(v11);
    const std::vector<std::vector<double>> v20 = f4(v1, v11);
    const std::vector<std::vector<double>> v13 = f4(v10, v0);
    const std::vector<std::vector<double>> v21 = f7(v0);
    const std::vector<std::vector<double>> v34 = f7(v13);
    const std::vector<std::vector<std::vector<double>>> v23 { v10, v21, v1, v20 };
    std::vector<std::vector<std::vector<double>>> v30 = v23;
    v30[0] = v10;
    const std::vector<std::vector<double>> v47 = v30[3];
    v4 = v34;
    return v47;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const double &v4) {
    const std::vector<std::vector<double>> v5 = f2(v0);
    const std::vector<double> v14 = v5[0];
    const double v51 = v14[0];
    double v77 = v51;
    return v77;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v1({ { 3.0 }, { 4.0 } });
    std::vector<std::vector<double>> v2({ { 5.0 }, { 6.0 }, { 7.0 } });
    std::vector<std::vector<double>> v3({ { 8.0 } });
    double v4(9.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
