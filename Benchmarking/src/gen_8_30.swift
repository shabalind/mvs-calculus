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
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v7: [s1] = v0[0]
    let v3: s1 = v7[0]
    let v2: s0 = v3.p1
    let v17: [[Double]] = v2.p2
    let v27: [Double] = v17[0]
    let v43: Double = v27[0]
    var v47: Double = v43
    let v91: Double = v47 / v47
    let v64: Double = v27[0]
    let v90: Double = v64 / v91
    v47 = v43
    return v90
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0]], p2: [[9.0]]))], [s1(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0]], p2: [[14.0]]), p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0]], p2: [[19.0]]))], [s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]], p2: [[24.0]]), p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0]], p2: [[29.0]]))]]
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
