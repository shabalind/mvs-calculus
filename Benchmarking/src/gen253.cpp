  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f11(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<s0> v7 { v0, v0, v0, v0, v0 };
    const s0 v2 = v7[3];
    std::vector<s0> v11 = v7;
    v11[2] = v0;
    const std::vector<std::vector<double>> v1 = v2.p0;
    const std::vector<std::vector<double>> v13 = v0.p0;
    s0 v12 = v2;
    std::vector<s0> v21 = v11;
    const std::vector<std::vector<double>> v17 = v12.p1;
    v21[0] = v12;
    const std::vector<std::vector<double>> v9 = v0.p1;
    std::vector<std::vector<double>> v16 = v1;
    v12.p1 = v17;
    v12.p0 = v1;
    const std::vector<std::vector<double>> v10 = v12.p1;
    v12.p0 = v13;
    const std::vector<std::vector<double>> v50 = v2.p0;
    v12.p1 = v4;
    std::vector<s0> v26 = v21;
    v12.p0 = v50;
    v12.p0 = v16;
    const s0 v49 = v26[2];
    const std::vector<std::vector<double>> v52 = v12.p0;
    v12.p0 = v50;
    std::vector<std::vector<double>> v48 = v10;
    const s0 v46 = v26[3];
    const std::vector<double> v47 = v52[1];
    s0 v57 = v49;
    v12.p1 = v4;
    const s0 v14 = v7[2];
    v57.p0 = v13;
    const std::vector<std::vector<double>> v67 = v57.p0;
    const std::vector<std::vector<double>> v72 = v46.p0;
    v12.p1 = v9;
    v48[0] = v47;
    s0 v38 = v46;
    std::vector<s0> v108 = v21;
    v57.p0 = v72;
    v26[4] = v57;
    v108[3] = v14;
    v12.p0 = v67;
    const s0 v175 = v7[3];
    v12.p1 = v48;
    std::vector<std::vector<double>> v124 = v9;
    const s0 v106 = v108[0];
    v38.p1 = v124;
    v26[1] = v175;
    v108[4] = v38;
    return v106;
  }
  s0 f8(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p0;
    const std::vector<double> v4 = v1[2];
    std::vector<std::vector<double>> v2 = v1;
    const s0 v8 = f11(v0);
    const std::vector<std::vector<double>> v12 = v8.p0;
    v2[1] = v4;
    const std::vector<std::vector<double>> v15 = v0.p1;
    const s0 v5(v2, v15);
    const s0 v3 = f11(v5);
    const std::vector<std::vector<double>> v11 = v3.p0;
    const s0 v14(v12, v15);
    const s0 v28 = f11(v3);
    v2 = v11;
    const s0 v35 = f11(v14);
    const s0 v31 = f11(v14);
    const std::vector<s0> v74 { v35, v35, v31, v28 };
    const s0 v63 = v74[2];
    return v63;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v7 = v0[1];
    std::vector<s0> v6 = v7;
    const s0 v3 = v6[0];
    v6[0] = v3;
    const s0 v2 = f8(v3);
    const s0 v8 = f11(v2);
    const std::vector<std::vector<double>> v23 = v8.p1;
    const std::vector<double> v21 = v23[0];
    const double v44 = v21[0];
    double v124 = v44;
    return v124;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } });
    double v1(8.0);
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
