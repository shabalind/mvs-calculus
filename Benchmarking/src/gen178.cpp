  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s4(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f11(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<std::vector<std::vector<double>>> v5 { v6, v8, v7, v7, v8, v7, v7 };
    std::vector<std::vector<std::vector<double>>> v1 = v5;
    std::vector<std::vector<std::vector<double>>> v11 = v5;
    const std::vector<std::vector<double>> v12 = v11[3];
    const std::vector<std::vector<double>> v25 = v0.p1;
    const std::vector<std::vector<double>> v17 = v0.p0;
    s0 v32 = v0;
    v32.p1 = v17;
    std::vector<std::vector<std::vector<double>>> v26 = v5;
    v11[6] = v25;
    std::vector<std::vector<std::vector<double>>> v72 = v1;
    v72[5] = v8;
    v32.p1 = v8;
    v32.p1 = v7;
    const std::vector<std::vector<double>> v24 = v32.p1;
    const std::vector<std::vector<double>> v29 = v32.p1;
    v32.p1 = v17;
    const std::vector<std::vector<double>> v27 = v0.p0;
    const s0 v34(v29, v25);
    v32.p1 = v12;
    const s0 v68(v29, v27);
    v32.p1 = v24;
    v1[1] = v17;
    v1 = v26;
    const std::vector<s0> v36 { v68, v34, v32, v32 };
    const std::vector<std::vector<double>> v51 = v0.p1;
    v1[4] = v8;
    v32.p1 = v51;
    const std::vector<std::vector<double>> v95 = v26[1];
    v26[3] = v29;
    v1[0] = v25;
    const s0 v54 = v36[1];
    v11 = v72;
    v32.p0 = v95;
    return v54;
  }
  s4 f8(const s4 &v0) {
    s4 v6 = v0;
    const std::vector<std::vector<s0>> v7 = v0.p0;
    v6 = v0;
    std::vector<std::vector<s0>> v5 = v7;
    v6 = v0;
    const std::vector<s0> v4 = v0.p1;
    v6.p0 = v5;
    const std::vector<std::vector<s0>> v2 = v0.p0;
    const std::vector<s0> v1 = v0.p1;
    v6.p1 = v4;
    v5[0] = v1;
    const std::vector<std::vector<s0>> v9 = v0.p0;
    v6.p1 = v1;
    s4 v8 = v6;
    const s0 v13 = v1[0];
    const s0 v10 = v4[0];
    std::vector<s0> v11 = v4;
    const s0 v22 = f11(v10);
    const s0 v14 = f11(v22);
    s4 v24 = v0;
    v6.p1 = v1;
    const std::vector<std::vector<s0>> v19 = v0.p0;
    std::vector<s0> v29 = v1;
    std::vector<std::vector<s0>> v17 = v2;
    v17[1] = v11;
    const std::vector<std::vector<s0>> v25 = v0.p0;
    const std::vector<std::vector<s0>> v31 = v24.p0;
    const s0 v42 = f11(v13);
    v6.p0 = v5;
    const s0 v18 = f11(v42);
    v29[0] = v14;
    v24.p1 = v4;
    const std::vector<s0> v32 = v9[0];
    const std::vector<s0> v40 = v19[0];
    const s0 v34 = f11(v13);
    const std::vector<s0> v38 = v17[1];
    v24.p1 = v38;
    v11[0] = v18;
    const s2 v45(v32, v11);
    v24.p0 = v5;
    const std::vector<s0> v111 = v19[1];
    v24.p0 = v19;
    s4 v92 = v8;
    v6.p0 = v2;
    const std::vector<s4> v54 { v6 };
    v24.p1 = v111;
    v92.p1 = v4;
    v6.p1 = v4;
    v8.p1 = v38;
    v92.p0 = v25;
    std::vector<s4> v112 = v54;
    v112[0] = v24;
    v24.p1 = v40;
    v11[0] = v34;
    const s4 v129 = v112[0];
    v92.p0 = v31;
    s2 v86 = v45;
    const std::vector<s0> v293 = v2[1];
    v8.p1 = v29;
    const std::vector<s0> v176 = v86.p0;
    v17[0] = v293;
    v5[1] = v29;
    const std::vector<s0> v189 = v92.p1;
    v17[1] = v176;
    v6.p1 = v189;
    return v129;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    const s4 v4 = v0[1];
    const s4 v14 = f8(v4);
    const std::vector<s0> v27 = v14.p1;
    const s0 v30 = v27[0];
    const std::vector<std::vector<double>> v29 = v30.p1;
    const s0 v20(v29, v29);
    const s0 v28 = f11(v20);
    const std::vector<std::vector<double>> v75 = v28.p1;
    const std::vector<double> v278 = v75[0];
    const double v139 = v278[0];
    return v139;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { 0.0 } }, { { 1.0 } } } }, { { { { 2.0 } }, { { 3.0 } } } } }, { { { { 4.0 } }, { { 5.0 } } } } }, { { { { { { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 } } } } }, { { { { 10.0 } }, { { 11.0 } } } } } });
    double v1(12.0);
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
