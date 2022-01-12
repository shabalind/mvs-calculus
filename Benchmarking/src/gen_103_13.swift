  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f26(_ v0: Double) -> Double {
    var v3: Double = v0
    var v1: Double = v0
    let v9: [Double] = [v0, v1, v3, v1, v0, v1, v1]
    let v7: Double = v9[2]
    let v4: Double = v9[6]
    var v6: [Double] = v9
    v6[0] = v1
    v3 = v4
    let v15: Double = v6[5]
    v1 = v15
    var v2: [Double] = v6
    v6[3] = v7
    let v11: Double = v6[4]
    v2[1] = v0
    let v17: Double = v9[5]
    v6[2] = v4
    v6 = v9
    var v34: [Double] = v2
    var v61: Double = v11
    var v21: [Double] = v34
    let v27: Double = v9[6]
    v21[3] = v27
    v34 = v2
    let v79: Double = v21[2]
    var v49: [Double] = v6
    v2[6] = v61
    v2 = v49
    v6[1] = v17
    return v79
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v2: Double = f26(v1)
    let v6: Double = f26(v2)
    return v6
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
