  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s0, _ v2: Double) -> Double {
    var v3: Double = v2
    let v9: [[Double]] = v1.p1
    let v14: [Double] = v9[0]
    let v11: [Double] = v9[0]
    var v31: [Double] = v11
    v31[0] = v3
    v31[0] = v2
    let v41: Double = v14[0]
    v31[0] = v41
    let v139: Double = v31[0]
    return v139
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])), s1(p0: [[s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])]], p1: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]))]
    let v1: s0 = s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])
    let v2: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
