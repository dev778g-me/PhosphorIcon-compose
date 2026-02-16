package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.PaintBrushHouseholdBold: ImageVector
    get() {
        if (_PaintBrushHouseholdBold != null) {
            return _PaintBrushHouseholdBold!!
        }
        _PaintBrushHouseholdBold = ImageVector.Builder(
            name = "Bold.PaintBrushHouseholdBold",
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
                moveTo(72f, 104f)
                lineTo(152f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(42f, 186f)
                lineTo(68f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(70f, 214f)
                lineTo(96f, 188f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(158f, 126f)
                lineToRelative(14.69f, 14.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22.62f)
                lineTo(96f, 240f)
                lineTo(16f, 160f)
                lineTo(92.69f, 83.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 0f)
                lineTo(130f, 98f)
                lineToRelative(61f, -67f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 225f, 65f)
                close()
            }
        }.build()

        return _PaintBrushHouseholdBold!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushHouseholdBold: ImageVector? = null
