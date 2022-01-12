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
  s0 f110(const s0 &v0) {
    s0 v7 = v0;
    s0 v3 = v7;
    s0 v4 = v0;
    s0 v1 = v3;
    s0 v6 = v0;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v16 = v0.p1;
    const std::vector<std::vector<double>> v10 = v6.p0;
    s0 v14 = v1;
    const s1 v12(v1, v4);
    const std::vector<std::vector<std::vector<double>>> v21 { v10, v10, v10, v10, v10 };
    const std::vector<std::vector<double>> v43 = v21[4];
    const std::vector<std::vector<std::vector<double>>> v18 { v2, v2, v2, v2, v16, v16, v16 };
    const std::vector<std::vector<double>> v26 = v18[3];
    const std::vector<std::vector<double>> v52 = v21[2];
    v1.p0 = v10;
    s1 v51 = v12;
    s1 v29 = v51;
    v6.p0 = v43;
    v1.p0 = v52;
    v51.p1 = v14;
    v29.p0 = v0;
    const s0 v85 = v29.p1;
    v4.p1 = v26;
    return v85;
  }
  s1 f87(const s1 &v0) {
    s1 v5 = v0;
    s1 v7 = v5;
    const s0 v4 = v7.p1;
    const std::vector<s1> v1 { v5, v5 };
    const s1 v9 = v1[0];
    v5.p0 = v4;
    return v9;
  }
  s0 f60(const s0 &v0) {
    s0 v7 = v0;
    const s0 v6 = f110(v0);
    const std::vector<std::vector<double>> v3 = v7.p0;
    const std::vector<std::vector<double>> v4 = v6.p1;
    const s0 v1 = f110(v7);
    const s0 v5 = f110(v1);
    v7 = v6;
    const s0 v10 = f110(v7);
    const std::vector<std::vector<double>> v13 = v5.p0;
    std::vector<std::vector<double>> v9 = v4;
    const s0 v12 = f110(v10);
    const s0 v11 = f110(v1);
    std::vector<std::vector<double>> v18 = v4;
    const std::vector<double> v22 = v18[0];
    v7.p1 = v18;
    const s0 v14 = f110(v7);
    v7.p0 = v3;
    std::vector<double> v16 = v22;
    v9 = v4;
    v9[0] = v16;
    const std::vector<std::vector<double>> v20 = v10.p1;
    const s0 v21 = f110(v0);
    const std::vector<double> v30 = v9[0];
    const std::vector<std::vector<double>> v23 = v14.p1;
    const s0 v71 = f110(v21);
    std::vector<std::vector<double>> v54 = v13;
    const std::vector<double> v63 = v23[0];
    v7 = v10;
    v7.p1 = v18;
    v18[0] = v22;
    v18[0] = v30;
    const s0 v33 = f110(v10);
    v18[0] = v63;
    const s1 v50(v12, v71);
    v7.p0 = v54;
    s1 v94 = v50;
    const s0 v78 = v94.p0;
    const s1 v74 = f87(v94);
    v94.p0 = v1;
    const s0 v103 = v50.p1;
    const s0 v81 = v74.p1;
    const std::vector<std::vector<double>> v56 = v78.p0;
    v94.p0 = v33;
    v94.p1 = v103;
    v94.p0 = v11;
    v7.p0 = v56;
    s0 v180 = v81;
    v180.p1 = v20;
    return v180;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v7 = v0[1];
    const s0 v5 = v7[0];
    const s0 v4 = v7[0];
    const s0 v11 = v7[0];
    const s0 v10 = f110(v5);
    const std::vector<std::vector<double>> v15 = v11.p0;
    std::vector<std::vector<double>> v30 = v15;
    const std::vector<std::vector<double>> v51 = v11.p1;
    const s0 v31 = f60(v4);
    const std::vector<std::vector<double>> v32 = v10.p0;
    const std::vector<double> v60 = v32[1];
    v30[0] = v60;
    const std::vector<double> v36 = v51[0];
    std::vector<double> v63 = v36;
    const double v62 = v60[0];
    const double v87 = v63[0];
    const std::vector<double> v252 = v30[0];
    const std::vector<std::vector<double>> v75 = v31.p1;
    std::vector<double> v72 = v252;
    const double v228 = v87 + v62;
    const std::vector<double> v145 = v75[0];
    const double v83 = v72[0];
    v63[0] = v83;
    v30[0] = v145;
    return v228;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } });
    double v1(6.0);
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
