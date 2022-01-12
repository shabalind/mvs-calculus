  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s1 f109(const s1 &v0) {
    s1 v2 = v0;
    const std::vector<s1> v3 { v0, v0, v0, v2, v0, v0, v0 };
    s1 v5 = v2;
    const s1 v4 = v3[6];
    std::vector<s1> v8 = v3;
    v8[6] = v5;
    const s1 v12 = v8[6];
    const s1 v20 = v8[2];
    v8[1] = v0;
    const s1 v14 = v8[5];
    v2 = v20;
    v8[4] = v4;
    v8[3] = v12;
    v8[2] = v14;
    const s1 v52 = v8[3];
    s1 v31 = v52;
    return v31;
  }
  s1 f102(const s1 &v0) {
    const s0 v1 = v0.p0;
    s0 v4 = v1;
    const std::vector<std::vector<double>> v9 = v4.p0;
    const s1 v13 = f109(v0);
    s1 v18 = v13;
    v18.p0 = v1;
    v4.p0 = v9;
    const s1 v49 = f109(v18);
    s0 v28 = v4;
    const s1 v76 = f109(v49);
    const s1 v87 = f109(v76);
    const s1 v93 = f109(v76);
    v18 = v87;
    v18.p1 = v28;
    const s1 v128 = f109(v93);
    return v128;
  }
  s0 f100(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    std::vector<std::vector<double>> v1 = v7;
    const std::vector<double> v5 = v1[1];
    v1[0] = v5;
    const std::vector<std::vector<double>> v4 = v0.p0;
    std::vector<std::vector<double>> v13 = v1;
    const std::vector<std::vector<double>> v3 = v0.p0;
    std::vector<std::vector<double>> v25 = v4;
    const std::vector<double> v10 = v25[0];
    v25[0] = v10;
    const std::vector<double> v14 = v1[0];
    s0 v11 = v0;
    const s1 v29(v11, v11);
    const double v21 = v5[0];
    s1 v9 = v29;
    s0 v26 = v11;
    const std::vector<std::vector<double>> v15 = v26.p0;
    const s1 v17 = f109(v9);
    v26.p0 = v3;
    const std::vector<std::vector<double>> v24 = v0.p0;
    v25[1] = v5;
    v9.p1 = v26;
    v25[1] = v10;
    s0 v35 = v26;
    const std::vector<double> v34 = v15[1];
    v35.p0 = v3;
    v26.p0 = v13;
    const s1 v51 = f109(v17);
    const s1 v76 = f102(v51);
    std::vector<double> v37 = v34;
    const s0 v50 = v76.p1;
    v13[0] = v34;
    const std::vector<double> v70 = v4[1];
    v13[1] = v10;
    v13[1] = v14;
    v11.p0 = v13;
    v13[0] = v37;
    v11.p0 = v24;
    const s1 v203 = f102(v51);
    v9.p0 = v50;
    double v188 = v21;
    v37[0] = v188;
    s0 v145 = v35;
    v9.p0 = v26;
    v25[0] = v70;
    const std::vector<std::vector<double>> v177 = v145.p0;
    const s0 v190 = v203.p0;
    v9.p1 = v26;
    v13 = v177;
    return v190;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v7 = f100(v0);
    const std::vector<std::vector<double>> v11 = v7.p0;
    const std::vector<double> v10 = v11[0];
    const std::vector<double> v23 = v11[1];
    const double v33 = v10[0];
    const double v48 = v23[0];
    const double v44 = v33 / v48;
    return v44;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } } });
    double v1(2.0);
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
