  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v6: s1 = v0[0]
    let v4: s0 = v6.p0
    let v8: [[Double]] = v4.p0
    let v9: [Double] = v8[0]
    let v27: [Double] = v8[1]
    let v33: Double = v9[0]
    var v51: [Double] = v27
    let v50: Double = v51[0]
    let v87: Double = v1 * v33
    v51[0] = v87
    return v50
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: [[4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0], [9.0]], p2: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]], p2: [[16.0], [17.0]])])]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
