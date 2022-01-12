  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  func f36(_ v0: s0, _ v1: s0) -> s0 {
    var v6: s0 = v0
    var v3: s0 = v6
    let v8: [[Double]] = v1.p0
    v3.p0 = v8
    return v3
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v6: s0 = v0.p0
    let v3: s0 = f36(v6, v6)
    let v2: [s0] = [v3, v3, v6, v3]
    let v9: s0 = v2[3]
    let v8: s0 = v0.p0
    let v5: [[Double]] = v9.p2
    var v18: s0 = v8
    v18.p2 = v5
    let v14: s0 = v2[3]
    let v22: [[Double]] = v18.p0
    v18.p0 = v5
    let v60: [[Double]] = v14.p1
    let v90: s0 = s0(p0: v22, p1: v60, p2: v22)
    let v49: s0 = f36(v90, v6)
    let v107: [[Double]] = v49.p2
    var v58: [[Double]] = v107
    let v101: [Double] = v58[0]
    let v171: Double = v101[0]
    return v171
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0], [6.0]]), p1: s1(p0: s0(p0: [[7.0], [8.0], [9.0]], p1: [[10.0]], p2: [[11.0], [12.0], [13.0]]), p1: s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0]], p2: [[18.0], [19.0], [20.0]])))
    let v1: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
