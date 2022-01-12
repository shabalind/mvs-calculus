  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: Double
    var p1: s1
  }
  func f26(_ v0: s0) -> s0 {
    let v3: [s0] = [v0, v0, v0, v0]
    var v7: s0 = v0
    var v4: [s0] = v3
    v4[2] = v0
    let v6: [[s0]] = [v3, v3, v4, v3, v3, v4, v4]
    let v8: [[Double]] = v0.p0
    v7.p0 = v8
    v4[2] = v7
    let v21: [Double] = v0.p1
    v7.p0 = v8
    v7.p0 = v8
    v7.p1 = v21
    let v10: [Double] = v7.p1
    v7.p0 = v8
    v4[0] = v7
    v7.p1 = v21
    let v23: [[Double]] = v7.p0
    v4[2] = v0
    v7.p0 = v23
    var v32: s0 = v7
    v7.p1 = v10
    v7.p0 = v8
    v4[2] = v32
    let v48: [s0] = v6[2]
    let v79: s0 = v48[2]
    v7.p1 = v10
    return v79
  }
  func f25(_ v0: [[Double]]) -> [[Double]] {
    let v6: [Double] = v0[1]
    var v7: [[Double]] = v0
    let v19: [[[Double]]] = [v7, v0, v0]
    var v11: [[[Double]]] = v19
    let v26: [[Double]] = v11[0]
    var v12: [[Double]] = v26
    v12[2] = v6
    return v12
  }
  func f15(_ v0: s0) -> s0 {
    let v6: s0 = f26(v0)
    let v4: [Double] = v0.p1
    let v3: [[Double]] = [v4, v4, v4, v4, v4, v4, v4]
    let v1: [Double] = v3[0]
    let v2: s0 = f26(v0)
    var v10: [[Double]] = v3
    let v14: s0 = f26(v6)
    let v15: [[Double]] = v14.p0
    let v20: [Double] = v6.p1
    v10[5] = v20
    let v18: [[Double]] = v2.p0
    let v27: s0 = f26(v2)
    var v29: [[Double]] = v3
    let v21: [Double] = v27.p1
    v29[3] = v1
    let v25: [Double] = v27.p1
    let v35: [Double] = v14.p1
    let v55: [[Double]] = f25(v18)
    v29[5] = v4
    v10[5] = v21
    let v60: [Double] = v3[3]
    let v81: [Double] = v10[3]
    v10[2] = v60
    let v40: s0 = f26(v14)
    let v94: s0 = f26(v40)
    let v51: [Double] = v29[5]
    v29[3] = v81
    v10[1] = v25
    var v66: s0 = v94
    v66.p0 = v15
    v66.p1 = v51
    v66.p1 = v21
    v66.p0 = v55
    v66.p1 = v35
    return v66
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s0, _ v2: [[s1]], _ v3: Double) -> Double {
    var v7: s0 = v1
    let v4: s0 = f15(v7)
    let v8: [Double] = v4.p1
    var v5: s0 = v4
    let v15: Double = v8[1]
    let v17: s1 = v0[0]
    let v20: [[Double]] = v4.p0
    let v23: [Double] = v20[0]
    let v24: s0 = f26(v5)
    var v27: [[Double]] = v20
    let v47: s0 = v17.p0
    v27[2] = v23
    v27[0] = v23
    let v13: s1 = v0[0]
    v27[1] = v23
    v5 = v47
    v7.p0 = v27
    let v26: s2 = s2(p0: v15, p1: v13)
    let v28: [[Double]] = f25(v20)
    v5 = v4
    let v37: [Double] = v28[1]
    let v63: [Double] = v24.p1
    let v58: Double = v26.p0
    v27[2] = v37
    v7.p1 = v63
    return v58
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0, 4.0, 5.0]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [9.0, 10.0, 11.0])])]
    let v1: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [15.0, 16.0, 17.0])
    let v2: [[s1]] = [[s1(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [21.0, 22.0, 23.0]), p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [27.0, 28.0, 29.0])])]]
    let v3: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
