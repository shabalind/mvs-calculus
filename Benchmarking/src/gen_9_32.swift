  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s1, _ v2: Double) -> Double {
    let v11: [[s0]] = v1.p1
    let v15: [s0] = v11[1]
    let v3: s0 = v15[0]
    let v10: s0 = v15[0]
    let v19: [[Double]] = v10.p0
    let v34: [Double] = v19[1]
    let v29: Double = v34[0]
    let v33: Double = v3.p1
    var v39: Double = v29
    let v75: Double = v33 - v39
    return v75
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: 2.0), p1: [[s0(p0: [[3.0], [4.0]], p1: 5.0)], [s0(p0: [[6.0], [7.0]], p1: 8.0)], [s0(p0: [[9.0], [10.0]], p1: 11.0)]])
    let v1: s1 = s1(p0: s0(p0: [[12.0], [13.0]], p1: 14.0), p1: [[s0(p0: [[15.0], [16.0]], p1: 17.0)], [s0(p0: [[18.0], [19.0]], p1: 20.0)], [s0(p0: [[21.0], [22.0]], p1: 23.0)]])
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
