  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    double p0;
    s1 p1;
    s2(double v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f26(const s0 &v0) {
    const std::vector<s0> v3 { v0, v0, v0, v0 };
    s0 v7 = v0;
    std::vector<s0> v4 = v3;
    v4[2] = v0;
    const std::vector<std::vector<s0>> v6 { v3, v3, v4, v3, v3, v4, v4 };
    const std::vector<std::vector<double>> v8 = v0.p0;
    v7.p0 = v8;
    v4[2] = v7;
    const std::vector<double> v21 = v0.p1;
    v7.p0 = v8;
    v7.p0 = v8;
    v7.p1 = v21;
    const std::vector<double> v10 = v7.p1;
    v7.p0 = v8;
    v4[0] = v7;
    v7.p1 = v21;
    const std::vector<std::vector<double>> v23 = v7.p0;
    v4[2] = v0;
    v7.p0 = v23;
    s0 v32 = v7;
    v7.p1 = v10;
    v7.p0 = v8;
    v4[2] = v32;
    const std::vector<s0> v48 = v6[2];
    const s0 v79 = v48[2];
    v7.p1 = v10;
    return v79;
  }
  std::vector<std::vector<double>> f25(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v6 = v0[1];
    std::vector<std::vector<double>> v7 = v0;
    const std::vector<std::vector<std::vector<double>>> v19 { v7, v0, v0 };
    std::vector<std::vector<std::vector<double>>> v11 = v19;
    const std::vector<std::vector<double>> v26 = v11[0];
    std::vector<std::vector<double>> v12 = v26;
    v12[2] = v6;
    return v12;
  }
  s0 f15(const s0 &v0) {
    const s0 v6 = f26(v0);
    const std::vector<double> v4 = v0.p1;
    const std::vector<std::vector<double>> v3 { v4, v4, v4, v4, v4, v4, v4 };
    const std::vector<double> v1 = v3[0];
    const s0 v2 = f26(v0);
    std::vector<std::vector<double>> v10 = v3;
    const s0 v14 = f26(v6);
    const std::vector<std::vector<double>> v15 = v14.p0;
    const std::vector<double> v20 = v6.p1;
    v10[5] = v20;
    const std::vector<std::vector<double>> v18 = v2.p0;
    const s0 v27 = f26(v2);
    std::vector<std::vector<double>> v29 = v3;
    const std::vector<double> v21 = v27.p1;
    v29[3] = v1;
    const std::vector<double> v25 = v27.p1;
    const std::vector<double> v35 = v14.p1;
    const std::vector<std::vector<double>> v55 = f25(v18);
    v29[5] = v4;
    v10[5] = v21;
    const std::vector<double> v60 = v3[3];
    const std::vector<double> v81 = v10[3];
    v10[2] = v60;
    const s0 v40 = f26(v14);
    const s0 v94 = f26(v40);
    const std::vector<double> v51 = v29[5];
    v29[3] = v81;
    v10[1] = v25;
    s0 v66 = v94;
    v66.p0 = v15;
    v66.p1 = v51;
    v66.p1 = v21;
    v66.p0 = v55;
    v66.p1 = v35;
    return v66;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s0 &v1, const std::vector<std::vector<s1>> &v2, const double &v3) {
    s0 v7 = v1;
    const s0 v4 = f15(v7);
    const std::vector<double> v8 = v4.p1;
    s0 v5 = v4;
    const double v15 = v8[1];
    const s1 v17 = v0[0];
    const std::vector<std::vector<double>> v20 = v4.p0;
    const std::vector<double> v23 = v20[0];
    const s0 v24 = f26(v5);
    std::vector<std::vector<double>> v27 = v20;
    const s0 v47 = v17.p0;
    v27[2] = v23;
    v27[0] = v23;
    const s1 v13 = v0[0];
    v27[1] = v23;
    v5 = v47;
    v7.p0 = v27;
    const s2 v26(v15, v13);
    const std::vector<std::vector<double>> v28 = f25(v20);
    v5 = v4;
    const std::vector<double> v37 = v28[1];
    const std::vector<double> v63 = v24.p1;
    const double v58 = v26.p0;
    v27[2] = v37;
    v7.p1 = v63;
    return v58;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0, 4.0, 5.0 } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { 9.0, 10.0, 11.0 } } } } });
    s0 v1({ { { 12.0 }, { 13.0 }, { 14.0 } }, { 15.0, 16.0, 17.0 } });
    std::vector<std::vector<s1>> v2({ { { { { { 18.0 }, { 19.0 }, { 20.0 } }, { 21.0, 22.0, 23.0 } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { 27.0, 28.0, 29.0 } } } } } });
    double v3(30.0);
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
