  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f108(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p0;
    s0 v6 = v0;
    v6.p0 = v2;
    s0 v1 = v0;
    s0 v5 = v6;
    const std::vector<std::vector<double>> v3 = v1.p2;
    const std::vector<std::vector<double>> v7 = v1.p2;
    const std::vector<std::vector<double>> v12 = v6.p0;
    const std::vector<std::vector<double>> v13 = v0.p1;
    const s0 v9(v12, v7, v3);
    v5.p2 = v13;
    v1.p2 = v7;
    v1.p1 = v7;
    s0 v18 = v1;
    const std::vector<std::vector<double>> v38 = v0.p0;
    const std::vector<std::vector<double>> v16 = v1.p1;
    std::vector<std::vector<double>> v17 = v7;
    const std::vector<std::vector<double>> v31 = v9.p1;
    const std::vector<std::vector<double>> v25 = v18.p0;
    const std::vector<std::vector<double>> v37 = v18.p0;
    v6.p2 = v7;
    v18.p2 = v16;
    v6.p2 = v3;
    v6.p0 = v37;
    const std::vector<std::vector<double>> v58 = v6.p0;
    v1.p0 = v25;
    v6.p2 = v17;
    const s1 v32(v9, v18);
    v6.p0 = v38;
    v6 = v5;
    v1.p0 = v58;
    v6.p1 = v31;
    s1 v125 = v32;
    s1 v151 = v125;
    const s0 v99 = v151.p0;
    return v99;
  }
  s2 f102(const s2 &v0) {
    s2 v2 = v0;
    v2 = v0;
    s2 v6 = v2;
    const s1 v4 = v6.p0;
    s2 v8 = v0;
    v8.p0 = v4;
    const s0 v7 = v4.p0;
    const s0 v5 = f108(v7);
    const std::vector<std::vector<double>> v11 = v5.p1;
    s0 v10 = v7;
    v2 = v8;
    s1 v20 = v4;
    v10.p1 = v11;
    const s0 v18 = f108(v5);
    v8.p0 = v20;
    const s0 v34 = f108(v18);
    v6.p1 = v10;
    const s2 v37(v20, v5);
    v20.p1 = v10;
    v2.p1 = v10;
    v2.p0 = v20;
    v20.p0 = v34;
    return v37;
  }
  s0 f100(const s1 &v0, const s0 &v1) {
    s1 v9 = v0;
    const s0 v21 = v0.p0;
    s1 v4 = v9;
    v4.p0 = v21;
    v4 = v0;
    const s0 v12 = v4.p0;
    return v12;
  }
  s0 f97(const s0 &v0) {
    const s0 v6 = f108(v0);
    const s0 v3 = f108(v6);
    const s0 v12 = f108(v3);
    const std::vector<std::vector<double>> v29 = v6.p0;
    const s0 v17 = f108(v12);
    s0 v31 = v17;
    v31.p0 = v29;
    const s0 v83 = f108(v31);
    return v83;
  }
  s1 f86(const s1 &v0) {
    s1 v3 = v0;
    const s0 v2 = v3.p1;
    const s0 v5 = f108(v2);
    const s0 v1 = f108(v5);
    const s0 v11 = f100(v0, v5);
    const s0 v42 = f97(v11);
    const s0 v54 = f97(v1);
    s1 v35 = v3;
    const s0 v41 = v35.p1;
    v3.p0 = v54;
    v35.p0 = v41;
    const s0 v108 = v35.p0;
    const s0 v58 = f100(v0, v2);
    const s0 v33 = f108(v42);
    v3.p1 = v108;
    v3.p1 = v33;
    const s0 v100 = f108(v58);
    v3 = v35;
    v3.p0 = v5;
    const s0 v117 = f108(v33);
    v35 = v3;
    const s1 v140(v100, v58);
    v3.p0 = v117;
    return v140;
  }
  s0 f48(const s0 &v0) {
    s0 v1 = v0;
    s0 v12 = v1;
    return v12;
  }
  s0 f41(const s0 &v0) {
    const s0 v2 = f48(v0);
    const s0 v1 = f48(v0);
    const s0 v3 = f108(v2);
    s0 v10 = v2;
    const std::vector<std::vector<double>> v13 = v1.p1;
    const std::vector<std::vector<double>> v14 = v1.p0;
    const std::vector<std::vector<double>> v25 = v10.p0;
    std::vector<std::vector<double>> v16 = v13;
    const s0 v42(v25, v16, v13);
    const std::vector<double> v109 = v25[0];
    v10.p2 = v13;
    const std::vector<std::vector<double>> v43 = v0.p0;
    const std::vector<std::vector<double>> v27 = v0.p2;
    v10.p1 = v27;
    const std::vector<std::vector<double>> v38 = v42.p1;
    const std::vector<double> v71 = v16[0];
    v10.p0 = v43;
    const std::vector<double> v121 = v25[0];
    const std::vector<std::vector<double>> v99 = v3.p2;
    v16[0] = v109;
    v16 = v99;
    const std::vector<double> v63 = v14[0];
    v16 = v99;
    v16[0] = v71;
    v16[0] = v121;
    const s0 v98(v14, v13, v38);
    s0 v92 = v98;
    v16[0] = v63;
    v92.p0 = v25;
    return v92;
  }
  s2 f29(const std::vector<s1> &v0, const s2 &v1) {
    const s0 v6 = v1.p1;
    const std::vector<std::vector<double>> v3 = v6.p2;
    s0 v7 = v6;
    std::vector<std::vector<double>> v10 = v3;
    const s1 v2 = v0[0];
    s0 v12 = v7;
    const std::vector<double> v8 = v3[0];
    v12 = v6;
    v7.p1 = v3;
    const s0 v4 = v2.p0;
    const std::vector<double> v13 = v10[0];
    v10[0] = v13;
    std::vector<std::vector<double>> v14 = v10;
    std::vector<std::vector<double>> v33 = v3;
    v33[0] = v8;
    const s0 v19 = f108(v12);
    const s0 v23 = f97(v19);
    const std::vector<std::vector<double>> v26 = v6.p2;
    const std::vector<double> v39 = v10[0];
    s0 v36 = v23;
    const s2 v35 = f102(v1);
    v36.p2 = v26;
    v10[0] = v8;
    v33[0] = v39;
    v36.p2 = v14;
    const s1 v38 = v35.p0;
    v12.p1 = v33;
    const std::vector<double> v59 = v10[0];
    const std::vector<std::vector<double>> v52 = v4.p0;
    std::vector<std::vector<double>> v91 = v3;
    const double v29 = v59[0];
    const std::vector<std::vector<std::vector<double>>> v48 { v14, v3, v33, v26 };
    const double v79 = v59[0];
    v7.p0 = v52;
    const std::vector<double> v98 = v14[0];
    v7.p2 = v10;
    std::vector<std::vector<std::vector<double>>> v43 = v48;
    const std::vector<std::vector<double>> v61 = v4.p0;
    v36.p0 = v61;
    v10[0] = v13;
    std::vector<std::vector<std::vector<double>>> v71 = v43;
    std::vector<double> v72 = v8;
    v43[3] = v91;
    const s2 v90(v38, v36);
    std::vector<double> v193 = v59;
    const double v83 = v29 + v79;
    v14[0] = v193;
    v193[0] = v83;
    v10[0] = v72;
    const std::vector<std::vector<double>> v97 = v43[2];
    const std::vector<std::vector<double>> v104 = v71[0];
    v12.p1 = v10;
    const std::vector<std::vector<double>> v148 = v43[3];
    v14[0] = v98;
    v12.p2 = v97;
    v43[0] = v97;
    v43[3] = v148;
    v36.p2 = v14;
    v7.p1 = v104;
    return v90;
  }
  s1 f24(const s1 &v0) {
    const s1 v3 = f86(v0);
    const s1 v2 = f86(v3);
    const s1 v4 = f86(v3);
    const std::vector<s1> v1 { v4, v3 };
    const s0 v7 = v2.p1;
    std::vector<s1> v15 = v1;
    const s0 v24 = f41(v7);
    const s0 v21 = v4.p0;
    const s0 v26 = f41(v21);
    v15[1] = v4;
    const s1 v88(v26, v21);
    const s0 v54 = f97(v24);
    const s2 v52(v88, v54);
    const s2 v80 = f102(v52);
    const s2 v85 = f29(v15, v80);
    const s1 v77 = v85.p0;
    return v77;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s1 v6(v0, v0);
    const s1 v3 = f24(v6);
    const s0 v9 = v3.p1;
    const s1 v4(v9, v9);
    const s0 v11 = v4.p1;
    const std::vector<std::vector<double>> v16 = v11.p0;
    double v33 = v1;
    const std::vector<double> v23 = v16[2];
    const double v24 = v23[0];
    const std::vector<double> v32 = v16[2];
    const double v22 = v32[0];
    std::vector<double> v38 = v32;
    v38[0] = v22;
    double v34 = v24;
    v38[0] = v33;
    const double v99 = v32[0];
    v38[0] = v99;
    std::vector<double> v66 = v38;
    v66[0] = v34;
    const double v88 = v66[0];
    return v88;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 } } });
    double v1(5.0);
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
