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
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<std::vector<s3>> p0;
    std::vector<std::vector<s0>> p1;
    s5(std::vector<std::vector<s3>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    std::vector<s5> v7 = v0;
    const s5 v3 = v7[1];
    const s5 v6 = v7[1];
    const s5 v2 = v0[0];
    const std::vector<std::vector<s0>> v5 = v6.p1;
    const std::vector<s0> v11 = v5[1];
    const std::vector<std::vector<s3>> v12 = v2.p0;
    const s0 v15 = v11[0];
    std::vector<s0> v16 = v11;
    const s5 v29 = v0[0];
    const std::vector<std::vector<double>> v30 = v15.p1;
    s0 v18 = v15;
    const s0 v21 = v16[0];
    const s2 v36(v15, v18);
    const std::vector<s3> v31 = v12[0];
    const std::vector<std::vector<double>> v27 = v21.p0;
    std::vector<s3> v35 = v31;
    v7[1] = v3;
    std::vector<std::vector<double>> v25 = v27;
    const s0 v20 = v36.p0;
    v7[2] = v29;
    const std::vector<std::vector<double>> v44 = v20.p1;
    std::vector<std::vector<double>> v46 = v27;
    std::vector<s3> v38 = v31;
    const std::vector<double> v41 = v44[0];
    v16[0] = v18;
    const std::vector<std::vector<s3>> v78 { v38, v38, v35, v31, v31, v31 };
    std::vector<std::vector<s3>> v80 = v78;
    s2 v47 = v36;
    const std::vector<double> v71 = v30[1];
    v80 = v78;
    v46[2] = v41;
    const s5 v73 = v0[1];
    const s0 v133 = v47.p1;
    std::vector<std::vector<double>> v63 = v46;
    v18.p0 = v25;
    std::vector<s5> v59 = v0;
    const std::vector<s3> v94 = v80[5];
    s0 v136 = v133;
    const s5 v65 = v59[2];
    const s3 v67 = v94[0];
    const std::vector<std::vector<double>> v108 = v136.p1;
    v25[0] = v71;
    v16[0] = v20;
    v7[0] = v73;
    v136.p0 = v63;
    const s1 v149 = v67.p0;
    v7[1] = v65;
    const s5 v318 = v0[2];
    const std::vector<double> v196 = v108[1];
    const s0 v238 = v149.p0;
    v59[1] = v318;
    v47.p0 = v238;
    const double v159 = v196[0];
    v35[0] = v67;
    v63[1] = v41;
    return v159;
  }
  int main() {
    std::vector<s5> v0({ { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } } }, { { { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } } } } }, { { { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } }, { { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } }, { { { { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } }, { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } } }, { { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } }, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } } } } }, { { { { { { 85.0 }, { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } } }, { { { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } }, { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 }, { 104.0 } } }, { { { 105.0 }, { 106.0 }, { 107.0 } }, { { 108.0 }, { 109.0 } } } } } } }, { { { { { 110.0 }, { 111.0 }, { 112.0 } }, { { 113.0 }, { 114.0 } } } }, { { { { 115.0 }, { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } } } } }, { { { { { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 } } }, { { { 125.0 }, { 126.0 }, { 127.0 } }, { { 128.0 }, { 129.0 } } } }, { { { { 130.0 }, { 131.0 }, { 132.0 } }, { { 133.0 }, { 134.0 } } }, { { { 135.0 }, { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } }, { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 }, { 144.0 } } } } } }, { { { { { { 145.0 }, { 146.0 }, { 147.0 } }, { { 148.0 }, { 149.0 } } }, { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 } } } }, { { { { 155.0 }, { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } } }, { { { 160.0 }, { 161.0 }, { 162.0 } }, { { 163.0 }, { 164.0 } } }, { { { 165.0 }, { 166.0 }, { 167.0 } }, { { 168.0 }, { 169.0 } } } } } } }, { { { { { 170.0 }, { 171.0 }, { 172.0 } }, { { 173.0 }, { 174.0 } } } }, { { { { 175.0 }, { 176.0 }, { 177.0 } }, { { 178.0 }, { 179.0 } } } } } } });
    double v1(180.0);
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
