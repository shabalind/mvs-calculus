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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s1> p1;
    s2(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    s1 p1;
    s4(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s0> p0;
    std::vector<s4> p1;
    s5(std::vector<s0> v0, std::vector<s4> v1): p0(v0), p1(v1) { }
  };
  s5 f89(const s4 &v0, const s5 &v1) {
    return v1;
  }
  s1 f88(const s1 &v0) {
    const std::vector<s0> v5 = v0.p1;
    const s0 v8 = v5[1];
    s0 v2 = v8;
    const s0 v4 = v0.p0;
    std::vector<s0> v7 = v5;
    const std::vector<std::vector<double>> v3 = v8.p1;
    const std::vector<double> v9 = v3[0];
    v7[0] = v2;
    v2.p1 = v3;
    const std::vector<std::vector<double>> v6 = v8.p1;
    v2.p1 = v6;
    const s0 v10 = v5[2];
    const std::vector<s0> v17 = v0.p1;
    std::vector<s0> v14 = v7;
    const std::vector<std::vector<double>> v12 = v10.p1;
    const std::vector<double> v26 = v6[0];
    const std::vector<std::vector<double>> v30 = v8.p0;
    std::vector<double> v37 = v26;
    const std::vector<double> v25 = v3[0];
    std::vector<std::vector<double>> v104 = v30;
    const s0 v27(v104, v12);
    v104[0] = v9;
    v104[0] = v37;
    const std::vector<std::vector<double>> v43 = v27.p0;
    const std::vector<s0> v40 = v0.p1;
    v2.p0 = v43;
    v7 = v17;
    const double v96 = v25[0];
    v37[0] = v96;
    const s0 v60 = v40[0];
    v14[2] = v4;
    const s1 v62(v60, v14);
    return v62;
  }
  s0 f85(const s0 &v0, const std::vector<s5> &v1) {
    s0 v3 = v0;
    const std::vector<s0> v4 { v3 };
    const std::vector<std::vector<double>> v8 = v0.p1;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<double>> v2 = v3.p1;
    v3.p1 = v8;
    std::vector<std::vector<double>> v5 = v6;
    v3.p1 = v2;
    v3.p0 = v6;
    const std::vector<double> v7 = v2[0];
    v3.p1 = v2;
    const std::vector<std::vector<double>> v14 = v3.p1;
    v5[0] = v7;
    v3.p0 = v5;
    v3.p1 = v8;
    const std::vector<std::vector<double>> v16 = v3.p0;
    v5[0] = v7;
    const std::vector<double> v22 = v2[0];
    v3.p1 = v8;
    const s0 v21 = v4[0];
    v3.p0 = v6;
    v5[0] = v22;
    v5[0] = v7;
    v3.p1 = v14;
    v3.p0 = v16;
    v3.p0 = v16;
    const s0 v25 = v4[0];
    const std::vector<std::vector<double>> v45 = v25.p1;
    v3.p1 = v45;
    return v21;
  }
  s1 f84(const s1 &v0) {
    s1 v2 = v0;
    v2 = v0;
    s1 v3 = v0;
    const s0 v12 = v0.p0;
    const std::vector<std::vector<double>> v6 = v12.p0;
    s0 v4 = v12;
    const s1 v9 = f88(v3);
    std::vector<std::vector<double>> v8 = v6;
    const std::vector<s0> v11 = v0.p1;
    const std::vector<s0> v10 = v2.p1;
    v4 = v12;
    v4.p0 = v8;
    const std::vector<s0> v14 = v0.p1;
    std::vector<s0> v17 = v10;
    const std::vector<double> v21 = v8[0];
    std::vector<std::vector<double>> v26 = v6;
    const s0 v19 = v9.p0;
    v17[0] = v19;
    const s0 v33 = v11[1];
    v4.p0 = v26;
    std::vector<s0> v23 = v14;
    const std::vector<double> v32 = v6[0];
    v26[0] = v32;
    const std::vector<s0> v28 = v0.p1;
    const s1 v71 = f88(v9);
    v23[0] = v33;
    const s1 v62 = f88(v2);
    v23[2] = v4;
    v26[0] = v21;
    v2.p1 = v17;
    v8[0] = v32;
    const s0 v141 = v11[1];
    const std::vector<std::vector<double>> v109 = v141.p1;
    const s0 v70 = v23[0];
    const std::vector<s0> v116 = v71.p1;
    std::vector<std::vector<double>> v148 = v109;
    const s0 v176 = v62.p0;
    v23[0] = v176;
    s1 v204 = v3;
    const s0 v98 = v116[0];
    const s1 v81 = f88(v204);
    v4.p1 = v148;
    const s0 v147 = v17[0];
    v2.p0 = v147;
    v204.p0 = v70;
    const s1 v150 = f88(v81);
    v204.p1 = v28;
    v17[1] = v98;
    return v150;
  }
  s5 f70(const s5 &v0) {
    const std::vector<s0> v2 = v0.p0;
    std::vector<s0> v5 = v2;
    s5 v6 = v0;
    const s0 v3 = v2[0];
    v5[0] = v3;
    v6.p0 = v2;
    v6.p0 = v5;
    const s0 v9 = v2[0];
    v6.p0 = v5;
    const std::vector<s4> v19 = v6.p1;
    v5[0] = v9;
    v5[0] = v3;
    v6.p1 = v19;
    v6.p1 = v19;
    return v6;
  }
  s5 f62(const s5 &v0) {
    const s5 v7 = f70(v0);
    const std::vector<s4> v5 = v0.p1;
    s5 v8 = v7;
    const std::vector<s4> v20 = v8.p1;
    v8.p1 = v5;
    const s5 v9 = f70(v8);
    const s4 v13 = v20[0];
    const s4 v10 = v20[0];
    const s4 v18 = v20[0];
    const std::vector<s0> v16 = v10.p0;
    const s0 v12 = v16[0];
    s0 v15 = v12;
    const std::vector<s4> v14 = v7.p1;
    v8 = v0;
    const s5 v21 = f89(v18, v9);
    std::vector<s0> v31 = v16;
    v31[1] = v12;
    const s1 v26 = v13.p1;
    v31[0] = v15;
    v31[0] = v15;
    const s1 v80 = f88(v26);
    const s1 v60 = f84(v80);
    const s1 v47 = f88(v60);
    std::vector<s0> v89 = v31;
    v8.p1 = v14;
    const s4 v108(v89, v47);
    const s5 v113 = f89(v108, v21);
    return v113;
  }
  s0 f44(const s1 &v0, const s0 &v1) {
    const std::vector<s0> v2 = v0.p1;
    s0 v4 = v1;
    std::vector<s0> v5 = v2;
    const s0 v9 = v5[1];
    v5[0] = v4;
    const std::vector<std::vector<double>> v26 = v1.p1;
    v4.p1 = v26;
    return v9;
  }
  std::vector<s0> f27(const std::vector<s0> &v0) {
    return v0;
  }
  s5 f20(const s5 &v0) {
    const s5 v5 = f62(v0);
    const std::vector<s0> v6 = v0.p0;
    const std::vector<s0> v1 = v0.p0;
    const std::vector<s0> v2 = v0.p0;
    const std::vector<s0> v11 = f27(v1);
    const s0 v7 = v11[0];
    const std::vector<s0> v8 = f27(v6);
    const std::vector<std::vector<double>> v16 = v7.p0;
    const std::vector<std::vector<double>> v10 = v7.p0;
    const s5 v13 = f62(v5);
    const std::vector<double> v14 = v10[0];
    s5 v18 = v5;
    const s0 v30 = v6[0];
    const s0 v17 = v2[0];
    const std::vector<s0> v27 = v13.p0;
    v18.p0 = v2;
    std::vector<std::vector<double>> v84 = v16;
    v84[0] = v14;
    const s5 v29 = f70(v18);
    std::vector<std::vector<double>> v19 = v84;
    const std::vector<std::vector<double>> v36 = v17.p1;
    const std::vector<s0> v20 = v5.p0;
    std::vector<s0> v52 = v27;
    v18.p0 = v52;
    const s0 v59(v19, v36);
    v18.p0 = v52;
    std::vector<std::vector<double>> v41 = v36;
    const std::vector<double> v26 = v41[0];
    const s5 v31 = f62(v13);
    const std::vector<s0> v60 { v30, v7, v59 };
    const std::vector<double> v77 = v36[0];
    const s0 v89 = v60[2];
    v18.p0 = v8;
    const s1 v158(v17, v60);
    s0 v69 = v17;
    v69.p0 = v16;
    v18.p0 = v20;
    const s5 v79 = f70(v31);
    const std::vector<std::vector<double>> v58 = v7.p0;
    const s1 v67 = f84(v158);
    const std::vector<s0> v91 = v158.p1;
    const std::vector<s4> v86 = v29.p1;
    std::vector<double> v80 = v26;
    s1 v50 = v67;
    std::vector<s4> v74 = v86;
    const s0 v178 = f44(v50, v69);
    const s1 v93(v89, v91);
    v18.p1 = v74;
    const std::vector<double> v176 = v58[0];
    v19[0] = v77;
    v50.p0 = v7;
    const s0 v247 = f44(v93, v178);
    v52[0] = v247;
    v18.p1 = v86;
    const s4 v126 = v86[0];
    v69.p0 = v84;
    s4 v153 = v126;
    v84[0] = v176;
    v84[0] = v80;
    v69.p0 = v16;
    const s5 v144 = f89(v153, v79);
    return v144;
  }
  s0 f2(const s0 &v0) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s1 &v1, const std::vector<std::vector<s5>> &v2, const s2 &v3, const double &v4) {
    const std::vector<s5> v5 = v2[1];
    const std::vector<s5> v9 = v2[1];
    const s0 v6 = f2(v0);
    std::vector<s5> v16 = v9;
    s0 v13 = v6;
    const std::vector<std::vector<double>> v26 = v6.p0;
    const s0 v14 = f85(v13, v16);
    const s5 v39 = v5[0];
    v16[0] = v39;
    const std::vector<std::vector<double>> v33 = v14.p0;
    const s5 v31 = f20(v39);
    std::vector<std::vector<double>> v66 = v33;
    v66 = v26;
    const std::vector<double> v50 = v66[0];
    const double v89 = v50[0];
    v16[0] = v31;
    return v89;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 } } });
    s1 v1({ { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } } });
    std::vector<std::vector<s5>> v2({ { { { { { { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 } } }, { { { 33.0 } }, { { 34.0 }, { 35.0 } } } } } } } } }, { { { { { { 36.0 } }, { { 37.0 }, { 38.0 } } } }, { { { { { { 39.0 } }, { { 40.0 }, { 41.0 } } }, { { { 42.0 } }, { { 43.0 }, { 44.0 } } } }, { { { { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { { 48.0 } }, { { 49.0 }, { 50.0 } } }, { { { 51.0 } }, { { 52.0 }, { 53.0 } } }, { { { 54.0 } }, { { 55.0 }, { 56.0 } } } } } } } } } });
    s2 v3({ { { { { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 } } }, { { { 63.0 } }, { { 64.0 }, { 65.0 } } }, { { { 66.0 } }, { { 67.0 }, { 68.0 } } } } }, { { { { { 69.0 } }, { { 70.0 }, { 71.0 } } }, { { { { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { 75.0 } }, { { 76.0 }, { 77.0 } } }, { { { 78.0 } }, { { 79.0 }, { 80.0 } } } } }, { { { { 81.0 } }, { { 82.0 }, { 83.0 } } }, { { { { 84.0 } }, { { 85.0 }, { 86.0 } } }, { { { 87.0 } }, { { 88.0 }, { 89.0 } } }, { { { 90.0 } }, { { 91.0 }, { 92.0 } } } } } } });
    double v4(93.0);
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
