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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  std::vector<s1> f66(const std::vector<s1> &v0) {
    std::vector<s1> v26 = v0;
    return v26;
  }
  std::vector<s1> f65(const std::vector<s1> &v0) {
    const std::vector<s1> v1 = f66(v0);
    std::vector<s1> v3 = v1;
    const s1 v7 = v0[0];
    std::vector<s1> v4 = v1;
    const s1 v8 = v4[0];
    s1 v6 = v7;
    s1 v9 = v8;
    std::vector<s1> v2 = v4;
    const std::vector<std::vector<s0>> v11 = v6.p1;
    const std::vector<s1> v10 = f66(v3);
    v9.p1 = v11;
    std::vector<s1> v5 = v3;
    const std::vector<s0> v22 = v11[0];
    std::vector<std::vector<s0>> v15 = v11;
    const s1 v13 = v0[0];
    v4[0] = v7;
    const std::vector<s1> v21 = f66(v0);
    const std::vector<std::vector<s1>> v14 { v21, v21, v0, v5, v10, v2, v21 };
    const std::vector<std::vector<s0>> v25 = v8.p1;
    const std::vector<s0> v12 = v11[1];
    const std::vector<std::vector<s0>> v42 = v7.p1;
    const std::vector<s1> v16 = f66(v5);
    const s0 v27 = v13.p0;
    const s1 v36(v27, v15);
    s0 v30 = v27;
    const std::vector<s1> v17 = v14[4];
    const std::vector<s1> v24 = f66(v16);
    v6.p0 = v30;
    const std::vector<s1> v51 = f66(v5);
    v5[0] = v13;
    const std::vector<s1> v47 = f66(v5);
    v15[0] = v12;
    const std::vector<s1> v57 = f66(v47);
    v2[0] = v6;
    s1 v28 = v36;
    v9.p1 = v25;
    const s0 v19 = v8.p0;
    v28.p1 = v42;
    const std::vector<s1> v38 = f66(v5);
    const std::vector<s1> v34 = f66(v5);
    const s0 v35 = v12[0];
    v28.p0 = v27;
    const s0 v32 = v22[0];
    s1 v33 = v28;
    const std::vector<std::vector<double>> v72 = v19.p1;
    v6.p1 = v11;
    const s0 v43 = v13.p0;
    const std::vector<std::vector<double>> v64 = v27.p1;
    std::vector<std::vector<s0>> v63 = v42;
    v6.p0 = v19;
    v5[0] = v13;
    v28.p0 = v35;
    v30.p1 = v72;
    const std::vector<s1> v23 = f66(v24);
    v6.p0 = v35;
    const s1 v95 = v17[0];
    const s1 v61 = v34[0];
    const std::vector<std::vector<std::vector<double>>> v53 { v64, v72, v72, v64 };
    const std::vector<std::vector<double>> v84 = v53[0];
    const std::vector<std::vector<s1>> v103 { v57, v34, v23, v51, v34 };
    const std::vector<std::vector<s0>> v71 = v36.p1;
    v5[0] = v33;
    v2[0] = v13;
    v4[0] = v95;
    v33.p0 = v32;
    std::vector<std::vector<s1>> v169 = v103;
    v6.p0 = v43;
    const std::vector<s0> v48 = v71[0];
    v33.p1 = v63;
    s0 v89 = v43;
    v6.p0 = v89;
    v33.p1 = v11;
    std::vector<std::vector<s1>> v98 = v169;
    std::vector<std::vector<s1>> v70 = v169;
    v5[0] = v9;
    v15[0] = v48;
    v169 = v70;
    const std::vector<s1> v129 = f66(v17);
    const std::vector<s1> v214 = v98[2];
    v6.p1 = v63;
    v28.p1 = v15;
    v169[3] = v38;
    const std::vector<s1> v160 = f66(v214);
    v30.p1 = v84;
    v4[0] = v61;
    v98[2] = v129;
    v33 = v6;
    return v160;
  }
  s0 f32(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<std::vector<double>> v1 = v0.p0;
    const std::vector<std::vector<double>> v9 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v13 { v4, v9, v9, v4, v4, v9, v4 };
    std::vector<std::vector<std::vector<double>>> v16 = v13;
    const std::vector<std::vector<double>> v19 = v16[6];
    const s0 v35(v1, v19);
    return v35;
  }
  s0 f20(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v1 = v0.p0;
    s0 v3 = v0;
    const std::vector<std::vector<double>> v11 = v3.p0;
    s0 v8 = v3;
    const s0 v18 = f32(v8);
    v3 = v8;
    const std::vector<std::vector<double>> v14 = v0.p0;
    const s0 v13 = f32(v8);
    std::vector<std::vector<double>> v12 = v4;
    v3.p0 = v4;
    const std::vector<std::vector<double>> v19 = v18.p0;
    const s0 v25 = f32(v18);
    s0 v15 = v18;
    const s0 v22 = f32(v25);
    const std::vector<std::vector<double>> v37 = v13.p0;
    const s0 v24 = f32(v15);
    v3.p0 = v19;
    s0 v33 = v24;
    v8.p0 = v1;
    const std::vector<std::vector<double>> v27 = v22.p1;
    const s0 v42 = f32(v24);
    v8.p1 = v27;
    const std::vector<std::vector<double>> v45 = v24.p1;
    v33.p0 = v37;
    v33.p0 = v12;
    const std::vector<std::vector<double>> v63 = v24.p1;
    const std::vector<std::vector<double>> v44 = v42.p1;
    v3.p0 = v37;
    v3.p0 = v37;
    const std::vector<double> v77 = v44[1];
    v15.p0 = v1;
    v12[2] = v77;
    const std::vector<std::vector<double>> v54 = v3.p1;
    v8.p0 = v14;
    const std::vector<double> v84 = v54[1];
    const s0 v107 = f32(v33);
    const s0 v123 = f32(v107);
    v15.p1 = v45;
    v12[1] = v84;
    v3.p1 = v63;
    v15.p0 = v11;
    v33 = v15;
    return v123;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const std::vector<s1> v7 = v0.p0;
    const std::vector<s1> v11 = f65(v7);
    const s1 v30 = v11[0];
    const s0 v19 = v30.p0;
    const s0 v10 = v30.p0;
    const s0 v9 = v30.p0;
    const std::vector<std::vector<double>> v15 = v10.p1;
    const s0 v13 = f32(v19);
    const std::vector<std::vector<double>> v26 = v9.p1;
    const std::vector<double> v24 = v26[0];
    const s0 v85 = f32(v13);
    s0 v70 = v85;
    const s0 v60 = f20(v9);
    s0 v114 = v70;
    v70 = v60;
    const std::vector<std::vector<double>> v98 = v114.p1;
    const std::vector<double> v135 = v98[0];
    const std::vector<std::vector<double>> v117 = v114.p0;
    std::vector<std::vector<double>> v106 = v117;
    v106[0] = v24;
    const std::vector<double> v163 = v106[2];
    v70.p1 = v15;
    const double v190 = v163[0];
    v106[0] = v135;
    return v190;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } } } } });
    double v1(30.0);
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
