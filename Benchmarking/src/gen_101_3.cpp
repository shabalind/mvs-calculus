  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    s1 p1;
    s5(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f67(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v3 = v7.p1;
    s0 v5 = v7;
    s0 v8 = v5;
    v7.p1 = v3;
    const std::vector<std::vector<double>> v4 = v8.p1;
    const std::vector<std::vector<double>> v2 = v7.p1;
    v5.p1 = v2;
    const std::vector<std::vector<double>> v10 = v8.p1;
    v8.p1 = v3;
    const std::vector<std::vector<double>> v15 = v0.p1;
    const std::vector<std::vector<double>> v23 = v7.p1;
    v7.p1 = v23;
    v5.p1 = v2;
    const std::vector<s0> v29 { v8, v7 };
    v7.p1 = v15;
    const std::vector<std::vector<double>> v37 = v5.p1;
    const std::vector<std::vector<double>> v59 = v5.p0;
    std::vector<std::vector<double>> v80 = v59;
    const s0 v49(v59, v4);
    v8.p1 = v37;
    std::vector<s0> v42 = v29;
    const std::vector<std::vector<double>> v38 = v49.p0;
    const std::vector<std::vector<double>> v124 = v8.p1;
    v5.p0 = v80;
    v5.p0 = v80;
    const s0 v119 = v42[1];
    v7.p1 = v10;
    s0 v101 = v119;
    v101.p1 = v2;
    v5.p1 = v124;
    v101.p0 = v38;
    return v101;
  }
  s1 f60(const s1 &v0) {
    s1 v2 = v0;
    const std::vector<s1> v4 { v0 };
    const s1 v6 = v4[0];
    s1 v5 = v2;
    v5 = v6;
    const s1 v15 = v4[0];
    s1 v1 = v5;
    const std::vector<s0> v8 = v1.p0;
    const std::vector<s0> v13 = v5.p0;
    std::vector<s0> v9 = v13;
    const s0 v10 = v2.p1;
    v2.p0 = v9;
    const s0 v19 = v9[0];
    std::vector<s0> v12 = v13;
    v9[0] = v10;
    const s5 v17(v19, v15);
    const s0 v21 = v8[0];
    const s0 v25 = v12[0];
    v5.p0 = v8;
    v2.p0 = v12;
    const std::vector<std::vector<s0>> v16 { v12, v12, v8 };
    v9[0] = v21;
    v5.p1 = v21;
    std::vector<std::vector<s0>> v23 = v16;
    const std::vector<s0> v56 = v23[2];
    v12[0] = v25;
    v5.p0 = v56;
    const s1 v104 = v17.p1;
    v23[2] = v56;
    return v104;
  }
  s1 f31(const s1 &v0) {
    s1 v7 = v0;
    const std::vector<s0> v1 = v0.p0;
    const s0 v2 = v1[0];
    v7.p1 = v2;
    const s1 v6 = f60(v7);
    s1 v5 = v6;
    const s1 v9 = f60(v0);
    const s0 v38 = v1[0];
    const s0 v15 = v0.p1;
    v7.p0 = v1;
    const std::vector<s0> v18 = v0.p0;
    const s5 v29(v15, v9);
    const s0 v24 = v29.p0;
    const s0 v22 = f67(v24);
    v7.p1 = v22;
    v7.p1 = v38;
    const s0 v32 = v6.p1;
    v7.p0 = v18;
    const std::vector<s0> v58 = v9.p0;
    v5.p0 = v58;
    v5.p1 = v32;
    v7.p0 = v58;
    return v5;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v4 = v0[1];
    const s1 v9 = f31(v4);
    const std::vector<s0> v8 = v9.p0;
    const s0 v11 = v8[0];
    const s0 v5 = v8[0];
    s0 v10 = v5;
    const std::vector<std::vector<double>> v29 = v10.p1;
    const std::vector<double> v12 = v29[1];
    const s0 v24 = f67(v11);
    const std::vector<std::vector<double>> v21 = v11.p0;
    v10.p1 = v29;
    v10.p0 = v21;
    const double v62 = v12[0];
    const double v32 = v1 / v62;
    const std::vector<std::vector<double>> v90 = v24.p0;
    const double v125 = v32 + v1;
    v10.p0 = v90;
    const std::vector<std::vector<double>> v101 = v11.p1;
    v10.p1 = v101;
    double v184 = v125;
    return v184;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } });
    double v1(24.0);
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
