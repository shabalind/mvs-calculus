  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [[s0]], _ v2: Double) -> Double {
    var v4: s0 = v0
    let v6: [s0] = v1[0]
    let v7: s0 = v6[0]
    let v8: [[Double]] = v4.p3
    let v5: [[Double]] = v7.p2
    v4.p3 = v8
    let v9: [[Double]] = v4.p1
    v4.p3 = v8
    let v12: [[Double]] = v0.p2
    v4.p2 = v12
    v4.p2 = v5
    let v29: [[Double]] = v4.p2
    v4.p3 = v9
    let v64: [Double] = v29[0]
    let v58: Double = v64[0]
    return v58
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0]], p3: [[6.0], [7.0], [8.0]])
    let v1: [[s0]] = [[s0(p0: [[9.0], [10.0]], p1: [[11.0], [12.0], [13.0]], p2: [[14.0]], p3: [[15.0], [16.0], [17.0]])]]
    let v2: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
