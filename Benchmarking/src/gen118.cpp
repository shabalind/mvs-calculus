  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f31(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<double> v4 = v7[1];
    s0 v8 = v0;
    v8 = v0;
    std::vector<std::vector<double>> v15 = v7;
    v15[1] = v4;
    v8.p0 = v7;
    v8.p0 = v15;
    const std::vector<std::vector<double>> v24 = v0.p1;
    v8.p0 = v15;
    const std::vector<std::vector<double>> v29 = v0.p0;
    const std::vector<std::vector<double>> v31 = v0.p1;
    const std::vector<std::vector<double>> v65 = v0.p1;
    std::vector<std::vector<double>> v46 = v7;
    v8.p1 = v24;
    v8.p0 = v7;
    v8.p0 = v46;
    v8.p0 = v29;
    v8.p0 = v15;
    const std::vector<double> v56 = v31[0];
    v15[1] = v56;
    v8.p1 = v65;
    s0 v36 = v8;
    return v36;
  }
  s1 f23(const s1 &v0) {
    const std::vector<s1> v5 { v0, v0 };
    const s1 v32 = v5[0];
    return v32;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    std::vector<std::vector<s1>> v6 = v0;
    std::vector<std::vector<s1>> v4 = v0;
    double v9 = v1;
    double v7 = v9;
    const std::vector<s1> v3 = v6[2];
    const s1 v8 = v3[0];
    v4[0] = v3;
    const s1 v2 = f23(v8);
    const s0 v5 = v2.p0;
    v7 = v1;
    const s1 v14 = f23(v2);
    const std::vector<s1> v18 = v0[1];
    std::vector<std::vector<s1>> v16 = v0;
    const s0 v10 = v14.p0;
    const std::vector<s1> v12 = v0[2];
    v16[0] = v18;
    v4[0] = v12;
    const double v13 = v1 * v7;
    const std::vector<std::vector<double>> v26 = v5.p0;
    const s0 v21 = f31(v5);
    const std::vector<s1> v17 = v0[0];
    const std::vector<std::vector<double>> v55 = v21.p1;
    std::vector<std::vector<s1>> v25 = v16;
    v16 = v25;
    const std::vector<double> v31 = v55[0];
    const s1 v27 = f23(v2);
    std::vector<double> v41 = v31;
    v25[1] = v17;
    const std::vector<double> v32 = v26[1];
    v6[1] = v3;
    std::vector<std::vector<double>> v38 = v55;
    std::vector<std::vector<double>> v28 = v55;
    const std::vector<double> v61 = v26[0];
    v41 = v32;
    const std::vector<s1> v40 = v4[1];
    v4[2] = v18;
    s1 v86 = v2;
    v28[0] = v32;
    const s1 v52 = v12[0];
    const s0 v36 = f31(v10);
    std::vector<std::vector<s1>> v59 = v25;
    v86.p0 = v36;
    v86 = v27;
    const s0 v54(v26, v38);
    v16[1] = v40;
    const std::vector<double> v76 = v28[0];
    const double v158 = v76[0];
    v86.p0 = v54;
    std::vector<s1> v124 = v12;
    const double v53 = v158 * v13;
    const double v133 = v61[0];
    v41[0] = v13;
    const s0 v119 = v52.p0;
    v4[0] = v124;
    std::vector<s1> v134 = v18;
    v59[0] = v17;
    v41[0] = v53;
    v6[1] = v17;
    const double v189 = v41[0];
    const s1 v194 = f23(v86);
    v86.p0 = v119;
    v41[0] = v133;
    const std::vector<s1> v163 = v59[0];
    const std::vector<s1> v82 = v25[2];
    v124[0] = v14;
    v41[0] = v9;
    v16[2] = v82;
    v6[0] = v163;
    v25[1] = v134;
    const s1 v465 = f23(v194);
    v134[0] = v465;
    return v189;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } }, { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } } });
    double v1(18.0);
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
