  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s0>> p1;
    s2(s1 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s0> p0;
    s0 p1;
    s6(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s2 f81(const s2 &v0, const s2 &v1) {
    const std::vector<std::vector<s0>> v7 = v0.p1;
    s2 v6 = v1;
    v6 = v0;
    const s1 v3 = v0.p0;
    const std::vector<s0> v12 = v7[0];
    v6.p0 = v3;
    std::vector<std::vector<s0>> v18 = v7;
    const s1 v14 = v6.p0;
    v6.p0 = v3;
    v6.p1 = v18;
    const s2 v40(v14, v7);
    v18 = v7;
    v18[0] = v12;
    return v40;
  }
  s1 f77(const s1 &v0) {
    const std::vector<s1> v6 { v0, v0, v0, v0, v0, v0 };
    const s1 v1 = v6[3];
    const std::vector<std::vector<s0>> v2 = v1.p1;
    const s0 v4 = v0.p0;
    const s0 v5 = v0.p0;
    const std::vector<double> v3 = v4.p0;
    std::vector<std::vector<s0>> v12 = v2;
    s0 v10 = v4;
    const std::vector<std::vector<double>> v7 = v4.p1;
    const std::vector<s0> v9 = v2[0];
    std::vector<s0> v26 = v9;
    const std::vector<double> v25 = v4.p0;
    const s1 v11(v5, v2);
    v26[0] = v5;
    const std::vector<s0> v13 = v12[1];
    const std::vector<double> v15 = v7[0];
    std::vector<double> v20 = v3;
    s0 v22 = v10;
    v12[0] = v26;
    v26[0] = v10;
    const s6 v14(v13, v22);
    const std::vector<s0> v17 = v14.p0;
    v12[2] = v9;
    v12[2] = v13;
    v12[0] = v13;
    const s0 v24 = v14.p1;
    const std::vector<s6> v18 { v14, v14, v14, v14, v14, v14, v14 };
    std::vector<double> v60 = v20;
    v12[0] = v26;
    v22.p1 = v7;
    std::vector<std::vector<double>> v28 = v7;
    v26[0] = v24;
    v28[2] = v15;
    v12[1] = v17;
    v22.p0 = v25;
    v22.p0 = v20;
    const std::vector<double> v45 = v10.p0;
    v22.p1 = v7;
    v28[1] = v15;
    const s6 v37 = v18[2];
    std::vector<std::vector<double>> v38 = v28;
    const s0 v29 = v37.p1;
    v10.p0 = v45;
    const s0 v49 = v26[0];
    const s0 v61 = v13[0];
    const std::vector<double> v50 = v7[1];
    const std::vector<double> v41 = v49.p0;
    v10.p1 = v38;
    std::vector<s0> v169 = v26;
    const std::vector<std::vector<double>> v89 { v60, v60, v41, v25 };
    v22.p0 = v25;
    std::vector<std::vector<double>> v96 = v38;
    v96[0] = v50;
    v22.p0 = v60;
    const std::vector<double> v167 = v89[3];
    v169[0] = v61;
    v28 = v96;
    v26[0] = v4;
    v12[1] = v169;
    s1 v99 = v11;
    const s0 v216 = v169[0];
    s1 v74 = v99;
    v74.p0 = v216;
    v10.p1 = v7;
    v99.p0 = v29;
    v22.p0 = v167;
    return v74;
  }
  s2 f76(const s2 &v0) {
    const s2 v5 = f81(v0, v0);
    s2 v4 = v5;
    const s1 v7 = v4.p0;
    s2 v6 = v0;
    s2 v8 = v5;
    s2 v3 = v0;
    const s1 v9 = f77(v7);
    s2 v10 = v5;
    const s2 v13 = f81(v6, v5);
    s2 v16 = v13;
    s2 v23 = v16;
    const s1 v27 = v16.p0;
    const s1 v25 = f77(v27);
    s2 v12 = v10;
    s2 v15 = v6;
    const std::vector<std::vector<s0>> v19 = v27.p1;
    s1 v17 = v9;
    const s2 v40 = f81(v0, v3);
    v6.p0 = v17;
    const std::vector<std::vector<s0>> v26 = v40.p1;
    std::vector<std::vector<s0>> v32 = v26;
    const std::vector<s0> v24 = v19[0];
    const std::vector<std::vector<s0>> v30 = v27.p1;
    std::vector<s0> v35 = v24;
    const s1 v33 = f77(v9);
    std::vector<s0> v31 = v24;
    v32[0] = v24;
    s2 v68 = v4;
    const s0 v37 = v33.p0;
    v12.p0 = v25;
    const s0 v57 = v31[0];
    const std::vector<std::vector<s0>> v38 = v9.p1;
    s2 v28 = v23;
    v28 = v8;
    v35[0] = v57;
    s2 v76 = v23;
    v15.p1 = v26;
    const std::vector<s0> v41 = v30[2];
    const std::vector<s0> v62 = v38[0];
    v32[0] = v62;
    const std::vector<std::vector<s0>> v191 = v76.p1;
    const std::vector<std::vector<s0>> v51 = v28.p1;
    v35[0] = v37;
    v32[0] = v35;
    const s1 v50 = f77(v27);
    std::vector<std::vector<s0>> v42 = v32;
    v17 = v7;
    const s2 v46 = f81(v6, v12);
    v42[0] = v41;
    const s2 v83 = f81(v46, v68);
    v68.p1 = v51;
    v23.p1 = v51;
    v42[0] = v31;
    v76.p0 = v50;
    const s2 v118 = f81(v15, v83);
    v4.p1 = v191;
    v76.p1 = v42;
    return v118;
  }
  std::vector<std::vector<s0>> f57(const std::vector<std::vector<s0>> &v0) {
    std::vector<std::vector<s0>> v4 = v0;
    std::vector<std::vector<s0>> v6 = v4;
    const std::vector<s0> v5 = v6[0];
    std::vector<std::vector<s0>> v20 = v0;
    v20[0] = v5;
    return v20;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<std::vector<s1>> &v1, const double &v2) {
    const s2 v7 = f76(v0);
    const std::vector<std::vector<s0>> v6 = v7.p1;
    const s1 v3 = v7.p0;
    const std::vector<std::vector<s0>> v8 = f57(v6);
    const std::vector<s0> v9 = v8[0];
    const s0 v4 = v9[0];
    const std::vector<s1> v10 = v1[0];
    const s0 v15 = v3.p0;
    const s1 v18 = v10[0];
    const s0 v12 = v18.p0;
    const std::vector<s0> v94 { v12, v15, v12, v4 };
    const s0 v69 = v94[2];
    const std::vector<double> v82 = v69.p0;
    const double v62 = v82[1];
    const double v120 = v2 + v2;
    const double v126 = v120 / v62;
    return v126;
  }
  int main() {
    s2 v0({ { { { 0.0, 1.0, 2.0 }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { { 6.0, 7.0, 8.0 }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0, 13.0, 14.0 }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { 18.0, 19.0, 20.0 }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } }, { { { { 24.0, 25.0, 26.0 }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } });
    std::vector<std::vector<s1>> v1({ { { { { 30.0, 31.0, 32.0 }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { { 36.0, 37.0, 38.0 }, { { 39.0 }, { 40.0 }, { 41.0 } } } }, { { { 42.0, 43.0, 44.0 }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { 48.0, 49.0, 50.0 }, { { 51.0 }, { 52.0 }, { 53.0 } } } } } } } });
    double v2(54.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
