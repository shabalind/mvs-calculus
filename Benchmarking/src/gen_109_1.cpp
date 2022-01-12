  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f4(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<double> v2 = v6[1];
    s0 v8 = v0;
    const std::vector<std::vector<double>> v1 = v8.p1;
    const std::vector<std::vector<double>> v4 = v0.p1;
    std::vector<std::vector<double>> v5 = v6;
    v8.p1 = v5;
    const std::vector<std::vector<std::vector<double>>> v3 { v1, v1 };
    v8.p1 = v4;
    v5[1] = v2;
    const std::vector<std::vector<std::vector<double>>> v7 { v1, v6 };
    std::vector<double> v13 = v2;
    const std::vector<std::vector<double>> v11 = v8.p0;
    const std::vector<std::vector<double>> v16 = v8.p0;
    const std::vector<std::vector<double>> v9 = v0.p1;
    v5[0] = v13;
    const std::vector<std::vector<double>> v10 = v0.p1;
    const std::vector<std::vector<double>> v12 = v0.p1;
    const double v23 = v13[0];
    v8.p0 = v11;
    double v24 = v23;
    std::vector<double> v22 = v2;
    const std::vector<std::vector<double>> v21 = v8.p0;
    const std::vector<std::vector<double>> v20 = v3[1];
    const std::vector<double> v25 = v16[0];
    const s0 v14(v11, v9);
    v5[1] = v25;
    std::vector<std::vector<double>> v32 = v16;
    const std::vector<double> v49 = v20[0];
    v32[0] = v22;
    std::vector<double> v39 = v49;
    v5[1] = v13;
    std::vector<std::vector<std::vector<double>>> v35 = v3;
    const std::vector<std::vector<double>> v38 = v8.p1;
    const double v41 = v24 * v24;
    const std::vector<std::vector<double>> v45 = v14.p1;
    const s0 v30(v16, v5);
    const std::vector<double> v58 = v10[1];
    const s0 v57(v21, v1);
    v8.p0 = v32;
    v8.p1 = v4;
    v8.p1 = v12;
    const std::vector<s0> v43 { v30, v14, v57, v57, v30, v14 };
    std::vector<s0> v72 = v43;
    v8.p1 = v4;
    std::vector<std::vector<double>> v33 = v1;
    v33[0] = v25;
    std::vector<std::vector<std::vector<double>>> v85 = v3;
    v8.p1 = v38;
    const s0 v65 = v72[1];
    const std::vector<std::vector<std::vector<std::vector<double>>>> v67 { v35, v7 };
    v35[1] = v45;
    const std::vector<std::vector<double>> v122 = v65.p1;
    const std::vector<std::vector<std::vector<double>>> v83 = v67[1];
    std::vector<std::vector<std::vector<double>>> v75 = v85;
    v35 = v75;
    s0 v81 = v65;
    v39[0] = v24;
    std::vector<std::vector<std::vector<double>>> v103 = v83;
    const double v131 = v13[0];
    v33[1] = v39;
    v22[0] = v41;
    v33[1] = v58;
    v22[0] = v131;
    const std::vector<std::vector<double>> v272 = v75[1];
    v8.p1 = v272;
    v81.p0 = v16;
    v75 = v103;
    v81.p1 = v33;
    v103[0] = v122;
    return v81;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v7 = v0.p1;
    const s0 v6 = v7[1];
    const s0 v5 = v7[2];
    const s0 v12 = v7[0];
    s0 v14 = v5;
    const std::vector<std::vector<double>> v9 = v6.p1;
    v14.p1 = v9;
    const s0 v16 = f4(v14);
    const std::vector<std::vector<double>> v21 = v16.p1;
    s0 v20 = v5;
    const std::vector<double> v19 = v21[1];
    v20.p1 = v21;
    const std::vector<std::vector<double>> v38 = v20.p0;
    const std::vector<std::vector<double>> v41 = v12.p0;
    std::vector<double> v55 = v19;
    std::vector<double> v79 = v55;
    v14.p0 = v41;
    v14.p0 = v38;
    v20.p1 = v9;
    const double v116 = v79[0];
    v20.p0 = v41;
    return v116;
  }
  int main() {
    s1 v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } } });
    double v1(15.0);
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
