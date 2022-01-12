  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s2
  }
  func f80(_ v0: [s0]) -> [s0] {
    let v2: [[s0]] = [v0]
    var v8: [[s0]] = v2
    var v9: [[s0]] = v8
    let v38: [s0] = v9[0]
    v9 = v8
    v8[0] = v0
    v8[0] = v38
    v9 = v8
    v8[0] = v0
    let v49: [s0] = v8[0]
    return v49
  }
  func f57(_ v0: Double, _ v1: s1) -> Double {
    let v5: [s0] = v1.p1
    let v4: [s0] = f80(v5)
    let v9: s0 = v5[0]
    let v13: s0 = v4[1]
    let v26: [[Double]] = v9.p0
    let v57: [[Double]] = v13.p0
    var v51: [[Double]] = v57
    let v43: [[[Double]]] = [v57, v51, v26, v51]
    let v124: [[Double]] = v43[2]
    let v82: [Double] = v124[0]
    let v120: Double = v82[0]
    return v120
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s3, _ v2: Double) -> Double {
    let v3: Double = f57(v2, v0)
    var v7: Double = v2
    v7 = v3
    var v39: Double = v7
    return v39
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])], p1: [s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]])])
    let v1: s3 = s3(p0: [s0(p0: [[15.0]], p1: [[16.0], [17.0]])], p1: s2(p0: [[s0(p0: [[18.0]], p1: [[19.0], [20.0]])]], p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]])))
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
