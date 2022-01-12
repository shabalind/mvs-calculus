  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s1, _ v2: s1, _ v3: [s1], _ v4: Double) -> Double {
    let v6: s1 = v3[0]
    let v15: s0 = v6.p0
    let v41: [[Double]] = v15.p0
    let v44: [Double] = v41[0]
    var v31: [Double] = v44
    let v54: Double = v31[0]
    var v65: [Double] = v44
    v65[0] = v54
    let v68: Double = v65[0]
    let v71: Double = v31[0]
    v31[0] = v71
    v65[0] = v54
    return v68
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])])
    let v1: s1 = s1(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0]]), p1: [s0(p0: [[15.0]], p1: [[16.0], [17.0]]), s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]])])
    let v2: s1 = s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: [s0(p0: [[27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0], [32.0]]), s0(p0: [[33.0]], p1: [[34.0], [35.0]])])
    let v3: [s1] = [s1(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0]]), p1: [s0(p0: [[39.0]], p1: [[40.0], [41.0]]), s0(p0: [[42.0]], p1: [[43.0], [44.0]]), s0(p0: [[45.0]], p1: [[46.0], [47.0]])])]
    let v4: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
