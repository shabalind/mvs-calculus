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
  s0 f87(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p0;
    const s1 v5(v0, v0);
    s1 v2 = v5;
    const s0 v7 = v5.p0;
    s0 v4 = v0;
    v4 = v7;
    s0 v10 = v4;
    s0 v8 = v7;
    const s1 v13(v8, v10);
    s1 v11 = v13;
    s0 v9 = v0;
    const std::vector<std::vector<double>> v17 = v9.p0;
    s1 v14 = v2;
    s0 v12 = v0;
    const std::vector<std::vector<double>> v15 = v7.p0;
    const s0 v29 = v5.p0;
    const s0 v26 = v11.p0;
    const std::vector<std::vector<double>> v16 = v8.p0;
    v2.p0 = v7;
    const std::vector<std::vector<double>> v18 = v0.p0;
    const std::vector<std::vector<std::vector<double>>> v24 { v15, v18, v16, v1, v15, v17, v18 };
    v11.p1 = v8;
    const std::vector<std::vector<double>> v36 = v9.p1;
    v10.p1 = v36;
    v2.p1 = v29;
    const std::vector<std::vector<double>> v41 = v24[6];
    v2.p1 = v10;
    const std::vector<std::vector<double>> v39 = v4.p0;
    v2.p1 = v7;
    v10.p0 = v39;
    const std::vector<s0> v74 { v26, v12, v0, v10, v0 };
    v11 = v14;
    std::vector<s0> v67 = v74;
    const s0 v107 = v67[0];
    v14.p0 = v4;
    v4.p0 = v41;
    return v107;
  }
  s1 f86(const s1 &v0) {
    const s0 v4 = v0.p0;
    s0 v2 = v4;
    const s0 v7 = v0.p0;
    const s0 v6 = f87(v7);
    s1 v12 = v0;
    const s0 v11 = f87(v2);
    const std::vector<std::vector<double>> v10 = v7.p1;
    const s0 v1 = f87(v6);
    const s1 v8(v1, v4);
    v2.p1 = v10;
    s1 v22 = v8;
    const s0 v19 = f87(v11);
    const s0 v33 = f87(v7);
    s1 v47 = v12;
    const s0 v51 = v22.p1;
    v47.p1 = v2;
    s0 v60 = v51;
    v22.p1 = v33;
    v47.p1 = v19;
    v47.p0 = v60;
    return v47;
  }
  s0 f85(const s0 &v0) {
    s0 v1 = v0;
    const s0 v4 = f87(v1);
    v1 = v0;
    const s0 v6 = f87(v4);
    v1 = v6;
    const s0 v5 = f87(v4);
    const std::vector<std::vector<double>> v11 = v1.p1;
    const s0 v7 = f87(v1);
    const std::vector<std::vector<double>> v17 = v5.p1;
    const std::vector<std::vector<double>> v14 = v5.p0;
    v1.p1 = v11;
    v1.p0 = v14;
    v1.p1 = v17;
    const s0 v13 = f87(v7);
    const s0 v43 = f87(v4);
    const s0 v66 = f87(v0);
    const s1 v35(v0, v66);
    const s0 v70 = v35.p1;
    s1 v38 = v35;
    v38.p1 = v70;
    const std::vector<s1> v100 { v38, v35 };
    v38.p1 = v13;
    std::vector<s1> v58 = v100;
    const s1 v91 = v58[0];
    v38.p1 = v43;
    const s0 v229 = v91.p1;
    v58[1] = v38;
    return v229;
  }
  s0 f81(const s0 &v0) {
    const s0 v5 = f87(v0);
    const std::vector<std::vector<double>> v6 = v5.p0;
    const std::vector<double> v7 = v6[1];
    s0 v1 = v5;
    const std::vector<std::vector<double>> v10 = v1.p1;
    std::vector<std::vector<double>> v16 = v6;
    s0 v14 = v1;
    const std::vector<std::vector<double>> v23 = v0.p1;
    v16[1] = v7;
    const std::vector<double> v79 = v23[1];
    v14.p1 = v10;
    const s0 v37 = f85(v14);
    v1.p0 = v16;
    v16[0] = v79;
    v16[1] = v79;
    v16[1] = v7;
    std::vector<std::vector<double>> v56 = v6;
    v14.p0 = v56;
    return v37;
  }
  s0 f78(const s0 &v0) {
    const s0 v3 = f87(v0);
    s0 v2 = v0;
    const std::vector<std::vector<double>> v1 = v2.p0;
    const s0 v5 = f81(v0);
    const std::vector<std::vector<double>> v7 = v2.p1;
    const std::vector<std::vector<double>> v13 = v3.p0;
    const std::vector<double> v8 = v13[2];
    const std::vector<double> v6 = v13[0];
    const std::vector<std::vector<double>> v4 { v8, v8, v8, v8, v8, v6, v8 };
    const s0 v11 = f85(v2);
    v2.p1 = v7;
    v2.p0 = v1;
    s0 v23 = v11;
    const std::vector<std::vector<double>> v9 = v0.p1;
    v2.p0 = v13;
    v23.p0 = v13;
    const std::vector<std::vector<double>> v19 = v23.p1;
    v23.p0 = v13;
    const std::vector<std::vector<double>> v22 = v3.p0;
    v2 = v3;
    const s0 v40 = f85(v0);
    const s0 v21 = f81(v40);
    std::vector<std::vector<double>> v27 = v13;
    v2.p0 = v1;
    const std::vector<std::vector<double>> v28 = v23.p1;
    const std::vector<std::vector<double>> v46 = v23.p0;
    const std::vector<std::vector<double>> v25 = v2.p1;
    const std::vector<std::vector<double>> v49 = v3.p0;
    const std::vector<std::vector<double>> v43 = v21.p1;
    v2.p0 = v27;
    const s0 v36 = f87(v11);
    const s0 v31 = f81(v5);
    const s0 v55 = f81(v36);
    const std::vector<double> v34 = v27[2];
    const s0 v76 = f85(v3);
    v2.p1 = v19;
    v27[2] = v34;
    v2 = v76;
    const std::vector<std::vector<double>> v58 = v55.p1;
    const s0 v53 = f81(v5);
    const std::vector<std::vector<std::vector<double>>> v95 { v25, v9, v58 };
    const std::vector<double> v84 = v4[4];
    const std::vector<std::vector<double>> v37 = v95[2];
    const std::vector<std::vector<double>> v80 = v53.p0;
    v2.p1 = v43;
    const std::vector<std::vector<double>> v41 = v95[0];
    const s0 v180 = f87(v53);
    const std::vector<std::vector<double>> v142 = v31.p0;
    v23.p0 = v46;
    v23.p1 = v7;
    v2.p0 = v1;
    const std::vector<std::vector<double>> v93 = v5.p1;
    const std::vector<double> v94 = v4[0];
    v2.p1 = v93;
    v27[1] = v84;
    v2.p0 = v1;
    v2.p0 = v49;
    v2.p0 = v46;
    const s0 v202(v46, v41);
    v23.p1 = v28;
    v23.p1 = v7;
    std::vector<std::vector<double>> v247 = v37;
    v27[0] = v94;
    v23.p1 = v247;
    const std::vector<std::vector<double>> v136 = v95[2];
    const std::vector<std::vector<double>> v353 = v180.p1;
    v23.p1 = v353;
    v2.p0 = v80;
    v2.p0 = v46;
    v23.p0 = v22;
    v23.p1 = v136;
    v2.p0 = v142;
    return v202;
  }
  s0 f71(const s0 &v0, const s0 &v1) {
    const s0 v7 = f78(v1);
    const std::vector<std::vector<double>> v2 = v1.p0;
    const std::vector<std::vector<double>> v4 = v1.p0;
    const std::vector<double> v13 = v4[0];
    std::vector<std::vector<double>> v11 = v4;
    v11[1] = v13;
    const s0 v10 = f81(v7);
    const std::vector<std::vector<double>> v6 = v1.p0;
    const s0 v9 = f87(v1);
    s0 v23 = v9;
    const std::vector<std::vector<double>> v15 = v7.p1;
    v23.p1 = v15;
    const s0 v25 = f87(v9);
    const std::vector<std::vector<double>> v17 = v10.p1;
    const s1 v27(v23, v1);
    const s0 v18 = f81(v23);
    v23.p1 = v17;
    const std::vector<std::vector<double>> v37 = v10.p1;
    v23.p0 = v11;
    v23.p1 = v15;
    v23.p1 = v37;
    const s1 v81 = f86(v27);
    const s1 v83 = f86(v27);
    const s1 v111 = f86(v83);
    v23.p1 = v17;
    const s0 v72 = f85(v18);
    const s0 v75 = v81.p0;
    const s0 v127 = v111.p1;
    v23.p0 = v6;
    const s0 v45 = v111.p1;
    v23.p0 = v2;
    const std::vector<s0> v82 { v25, v72, v45, v75, v9, v127 };
    std::vector<s0> v97 = v82;
    const s0 v110 = v97[1];
    return v110;
  }
  std::vector<s0> f4(const std::vector<s0> &v0) {
    const s0 v1 = v0[0];
    std::vector<s0> v4 = v0;
    const std::vector<std::vector<s0>> v6 { v0, v4, v4, v0 };
    v4[0] = v1;
    v4[0] = v1;
    v4[0] = v1;
    const std::vector<s0> v44 = v6[2];
    std::vector<std::vector<s0>> v98 = v6;
    const std::vector<s0> v104 = v98[0];
    v98[0] = v44;
    return v104;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v7 = v0[0];
    std::vector<std::vector<s0>> v3 = v0;
    const std::vector<s0> v10 = f4(v7);
    const s0 v13 = v10[0];
    v3[0] = v10;
    const std::vector<s0> v15 = v3[0];
    const s0 v12 = v15[0];
    const s0 v23 = f71(v13, v12);
    const std::vector<std::vector<double>> v25 = v23.p0;
    std::vector<std::vector<double>> v27 = v25;
    const std::vector<double> v45 = v27[0];
    std::vector<double> v127 = v45;
    const double v94 = v127[0];
    return v94;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } } });
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
