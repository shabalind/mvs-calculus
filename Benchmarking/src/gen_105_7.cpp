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
  s0 f45(const s0 &v0) {
    s0 v4 = v0;
    s0 v6 = v4;
    s0 v2 = v0;
    s0 v1 = v2;
    const std::vector<std::vector<double>> v8 = v1.p0;
    const std::vector<std::vector<double>> v3 = v6.p1;
    const std::vector<std::vector<double>> v7 = v6.p1;
    v4.p1 = v7;
    s0 v13 = v6;
    v4 = v1;
    std::vector<std::vector<double>> v17 = v8;
    v13.p0 = v8;
    v4 = v13;
    std::vector<std::vector<double>> v32 = v8;
    v1.p0 = v32;
    v2.p1 = v3;
    v2.p0 = v32;
    v2.p0 = v17;
    return v1;
  }
  s0 f43(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v8 = v7.p1;
    const s0 v6 = f45(v0);
    const s0 v12 = f45(v7);
    const s0 v13 = f45(v6);
    const std::vector<std::vector<std::vector<double>>> v14 { v8, v8, v8 };
    const std::vector<std::vector<double>> v31 = v12.p0;
    const std::vector<std::vector<double>> v16 = v12.p1;
    const std::vector<std::vector<std::vector<double>>> v23 { v31 };
    const std::vector<std::vector<double>> v27 = v23[0];
    std::vector<std::vector<std::vector<double>>> v25 = v23;
    std::vector<std::vector<double>> v33 = v16;
    const std::vector<std::vector<double>> v29 = v14[2];
    const s0 v30 = f45(v12);
    v7 = v13;
    const s0 v47 = f45(v30);
    v7.p1 = v29;
    v25 = v23;
    s0 v70 = v47;
    v70.p1 = v33;
    const std::vector<std::vector<double>> v86 = v25[0];
    v7.p0 = v27;
    v7.p0 = v86;
    return v70;
  }
  s0 f21(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<std::vector<double>> v9 = v0.p0;
    const s0 v1 = f45(v0);
    const std::vector<std::vector<double>> v8 = v1.p1;
    const std::vector<double> v16 = v8[2];
    const std::vector<std::vector<std::vector<double>>> v11 { v6, v8, v8, v8, v8, v6, v6 };
    std::vector<std::vector<double>> v42 = v9;
    v42[0] = v16;
    std::vector<std::vector<std::vector<double>>> v63 = v11;
    const std::vector<std::vector<double>> v72 = v63[5];
    v63[2] = v6;
    const s0 v57(v42, v72);
    return v57;
  }
  s0 f5(const s0 &v0) {
    const s0 v5 = f21(v0);
    const s0 v7 = f45(v5);
    s0 v4 = v0;
    const s0 v1 = f43(v7);
    s0 v11 = v5;
    s0 v6 = v11;
    const std::vector<std::vector<double>> v8 = v7.p0;
    v6.p0 = v8;
    s0 v13 = v5;
    const std::vector<std::vector<double>> v10 = v6.p1;
    const std::vector<std::vector<double>> v15 = v5.p0;
    v13.p1 = v10;
    const s0 v9 = f21(v6);
    const std::vector<double> v14 = v8[1];
    const s0 v34 = f21(v0);
    const std::vector<std::vector<double>> v17 = v1.p1;
    const std::vector<double> v16 = v17[2];
    std::vector<std::vector<double>> v24 = v17;
    const s0 v28 = f45(v9);
    const std::vector<double> v30 = v15[0];
    std::vector<std::vector<double>> v21 = v15;
    v21[0] = v16;
    v4 = v0;
    std::vector<std::vector<double>> v19 = v8;
    const s0 v42(v21, v10);
    v13.p1 = v24;
    v4.p1 = v17;
    const std::vector<std::vector<double>> v31 = v5.p1;
    const s0 v43 = f43(v28);
    v6 = v43;
    std::vector<std::vector<double>> v41 = v17;
    const s0 v57 = f43(v34);
    v4.p1 = v41;
    v6.p1 = v24;
    const s0 v61 = f43(v57);
    v21[0] = v30;
    const s0 v35 = f43(v13);
    v6.p0 = v19;
    const std::vector<s0> v80 { v61 };
    v24[0] = v30;
    const s0 v53 = f21(v4);
    std::vector<s0> v50 = v80;
    const s0 v32 = f45(v35);
    const std::vector<std::vector<double>> v70 = v1.p1;
    const std::vector<std::vector<double>> v121 = v42.p1;
    const std::vector<std::vector<double>> v131 = v61.p0;
    s0 v58 = v11;
    v24[2] = v14;
    v11.p1 = v70;
    const s0 v47 = f21(v53);
    const std::vector<double> v44 = v10[1];
    v13 = v7;
    v4.p0 = v19;
    const s0 v339 = v50[0];
    v13.p0 = v19;
    const std::vector<std::vector<double>> v193 = v53.p0;
    v58.p1 = v121;
    v6.p1 = v31;
    std::vector<std::vector<double>> v139 = v41;
    const s0 v126 = f43(v339);
    const s0 v101 = f43(v126);
    const std::vector<std::vector<double>> v66 = v35.p0;
    v6.p0 = v66;
    const std::vector<std::vector<double>> v163 = v32.p0;
    const s0 v177 = f45(v58);
    const s0 v114 = f43(v101);
    v13.p1 = v139;
    const std::vector<s0> v115 { v114, v47, v101, v1, v177 };
    v13.p0 = v193;
    v58.p1 = v139;
    const s0 v100 = v115[1];
    v4.p0 = v163;
    v11.p0 = v131;
    v139[0] = v44;
    v6.p0 = v19;
    return v100;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v3 = v0.p0;
    const s0 v4 = v3[1];
    const s0 v11 = f21(v4);
    const s0 v12 = f5(v11);
    s0 v10 = v12;
    const std::vector<std::vector<double>> v8 = v10.p1;
    std::vector<std::vector<double>> v36 = v8;
    const std::vector<double> v19 = v36[0];
    v36[0] = v19;
    const std::vector<std::vector<double>> v25 = v12.p0;
    v10.p0 = v25;
    const double v57 = v19[0];
    double v112 = v57;
    return v112;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } });
    double v1(20.0);
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
