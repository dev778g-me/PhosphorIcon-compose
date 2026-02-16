package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.HeartBreak: ImageVector
    get() {
        if (_HeartBreak != null) {
            return _HeartBreak!!
        }
        _HeartBreak = ImageVector.Builder(
            name = "Regular.HeartBreak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 75.63f)
                lineTo(116.18f, 63.82f)
                arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 102f)
                curveToRelative(0f, 66f, 104f, 122f, 104f, 122f)
                reflectiveCurveToRelative(104f, -56f, 104f, -122f)
                arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -92.18f, -38.18f)
                lineTo(112f, 91.63f)
                lineToRelative(30.18f, 30.19f)
                lineTo(120f, 144f)
            }
        }.build()

        return _HeartBreak!!
    }

@Suppress("ObjectPropertyName")
private var _HeartBreak: ImageVector? = null
