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
  struct s2 {
    std::vector<std::vector<s1>> p0;
    s0 p1;
    s2(std::vector<std::vector<s1>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s0>> p0;
    s2 p1;
    s4(std::vector<std::vector<s0>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s1> p0;
    s4 p1;
    s6(std::vector<s1> v0, s4 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<s0> p0;
    std::vector<std::vector<s1>> p1;
    s8(std::vector<s0> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    std::vector<std::vector<s8>> p0;
    s6 p1;
    s9(std::vector<std::vector<s8>> v0, s6 v1): p0(v0), p1(v1) { }
  };
  s6 f55(const s6 &v0, const s8 &v1) {
    const std::vector<s1> v6 = v0.p0;
    const std::vector<std::vector<s1>> v12 = v1.p1;
    const s4 v14 = v0.p1;
    const s2 v25 = v14.p1;
    const std::vector<s1> v34 = v12[0];
    const s6 v24(v6, v14);
    const std::vector<std::vector<s1>> v32 = v25.p0;
    const std::vector<s1> v59 = v32[0];
    s6 v22 = v24;
    s6 v67 = v0;
    v67 = v22;
    std::vector<s1> v40 = v59;
    v22.p1 = v14;
    v40 = v34;
    v22 = v0;
    v22.p0 = v40;
    v67.p1 = v14;
    return v67;
  }
  std::vector<s8> f46(const std::vector<s8> &v0) {
    const s8 v3 = v0[0];
    std::vector<s8> v2 = v0;
    v2[0] = v3;
    std::vector<s8> v4 = v0;
    const s8 v7 = v0[0];
    v2[0] = v7;
    const s8 v8 = v4[0];
    v2[0] = v7;
    v2[0] = v8;
    v2[0] = v3;
    v4[0] = v8;
    const s8 v74 = v2[0];
    v4[0] = v74;
    return v2;
  }
  s0 f21(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const s1 v9(v1, v0);
    std::vector<std::vector<double>> v2 = v6;
    const s0 v3 = v9.p1;
    const std::vector<std::vector<double>> v13 = v3.p0;
    const s0 v18 = v9.p0;
    const std::vector<std::vector<std::vector<double>>> v5 { v2, v6, v13, v13 };
    s1 v11 = v9;
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<std::vector<double>> v14 = v18.p0;
    v11.p0 = v1;
    const std::vector<std::vector<double>> v7 = v5[3];
    const std::vector<double> v10 = v8[1];
    const s0 v69 = v11.p1;
    v11.p1 = v69;
    s0 v26 = v18;
    v2[0] = v10;
    const std::vector<std::vector<double>> v31 = v69.p1;
    v26 = v1;
    s1 v34 = v9;
    v26.p1 = v31;
    const s0 v57 = v11.p0;
    const std::vector<double> v44 = v14[1];
    const s0 v62 = v34.p1;
    const std::vector<std::vector<double>> v40 = v0.p1;
    v2[0] = v44;
    v34.p0 = v26;
    std::vector<std::vector<double>> v43 = v31;
    s1 v64 = v9;
    v11.p1 = v57;
    v11.p1 = v62;
    v26.p1 = v40;
    v43 = v40;
    v64.p0 = v57;
    const s0 v80(v7, v43);
    v11 = v64;
    return v80;
  }
  s0 f4(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    const s0 v13 = f21(v0, v0);
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<double> v1 = v4[0];
    const std::vector<double> v16 = v7[0];
    std::vector<std::vector<double>> v15 = v7;
    const s1 v8(v0, v13);
    const s0 v9 = f21(v0, v13);
    const s0 v10 = f21(v13, v13);
    const std::vector<double> v20 = v15[0];
    v15[0] = v1;
    const s0 v14 = v8.p1;
    const s0 v42 = f21(v13, v9);
    v15[0] = v1;
    const s0 v35 = v8.p0;
    s0 v26 = v9;
    const std::vector<double> v29 = v7[0];
    const std::vector<double> v25 = v15[0];
    s0 v54 = v14;
    s0 v22 = v35;
    v15[0] = v16;
    const s0 v73 = f21(v42, v13);
    const s0 v38 = v8.p0;
    v15[0] = v29;
    const std::vector<s0> v72 { v38, v26, v73, v10, v35, v35 };
    v54.p1 = v4;
    v15[0] = v25;
    const s0 v61 = f21(v22, v14);
    v26.p1 = v4;
    v22.p1 = v4;
    const std::vector<std::vector<double>> v36 = v26.p1;
    v15[0] = v20;
    v22 = v54;
    v54.p1 = v4;
    v15[0] = v16;
    const s0 v116 = v72[5];
    v26.p1 = v15;
    const s0 v308 = f21(v61, v116);
    s0 v80 = v10;
    v22.p1 = v36;
    v54 = v80;
    return v308;
  }
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    s9 v10 = v0;
    const std::vector<std::vector<s8>> v3 = v10.p0;
    const std::vector<s8> v5 = v3[0];
    const s8 v12 = v5[0];
    const std::vector<s0> v8 = v12.p0;
    s9 v9 = v10;
    std::vector<std::vector<s8>> v18 = v3;
    std::vector<std::vector<s8>> v15 = v18;
    std::vector<s0> v19 = v8;
    const std::vector<s8> v11 = f46(v5);
    v9 = v0;
    const s0 v33 = v19[0];
    s9 v20 = v10;
    v20.p0 = v15;
    v15[1] = v5;
    const s0 v34 = f4(v33);
    const std::vector<s8> v28 = v18[0];
    const std::vector<std::vector<double>> v35 = v34.p0;
    const std::vector<s8> v56 = v15[0];
    const std::vector<std::vector<s8>> v30 = v0.p0;
    v9.p0 = v30;
    const s0 v26 = f21(v34, v33);
    const std::vector<s8> v16 = f46(v5);
    v19[0] = v26;
    v15[1] = v56;
    const s6 v63 = v9.p1;
    v10.p0 = v18;
    v18 = v15;
    const std::vector<double> v103 = v35[0];
    v10 = v9;
    const std::vector<s8> v49 = f46(v28);
    const s6 v73 = v20.p1;
    const s6 v58 = f55(v73, v12);
    v18[0] = v28;
    v18[0] = v16;
    v9.p1 = v58;
    v15[0] = v49;
    v15[0] = v16;
    v15[1] = v28;
    v18[0] = v11;
    v10.p1 = v63;
    const double v231 = v103[0];
    return v231;
  }
  int main() {
    s9 v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } } } } }, { { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } } } } }, { { { { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { 27.0 }, { 28.0 } }, { { 29.0 } } } } }, { { { { { { 30.0 }, { 31.0 } }, { { 32.0 } } } }, { { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } }, { { { { { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } } }, { { { { { 42.0 }, { 43.0 } }, { { 44.0 } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 } } } } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 } } } } } } });
    double v1(51.0);
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
