package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.GraduationCapBold: ImageVector
    get() {
        if (_GraduationCapBold != null) {
            return _GraduationCapBold!!
        }
        _GraduationCapBold = ImageVector.Builder(
            name = "Bold.GraduationCapBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 96f)
                lineToRelative(116f, -64f)
                lineToRelative(116f, 64f)
                lineToRelative(-116f, 64f)
                lineToRelative(-116f, -64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 240f)
                lineToRelative(0f, -115.31f)
                lineToRelative(-52f, -28.69f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 111.45f)
                verticalLineToRelative(54.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 5.31f)
                curveToRelative(-11.3f, 12.59f, -38.9f, 36.4f, -86f, 36.4f)
                reflectiveCurveToRelative(-74.68f, -23.81f, -86f, -36.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -5.31f)
                verticalLineTo(111.45f)
            }
        }.build()

        return _GraduationCapBold!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationCapBold: ImageVector? = null
