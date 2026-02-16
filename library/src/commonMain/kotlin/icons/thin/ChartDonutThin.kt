package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.ChartDonutThin: ImageVector
    get() {
        if (_ChartDonutThin != null) {
            return _ChartDonutThin!!
        }
        _ChartDonutThin = ImageVector.Builder(
            name = "Thin.ChartDonutThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 168f)
                lineTo(128f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(44.85f, 80f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 32f)
                verticalLineTo(88f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -34.65f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(89.35f, 138.36f)
                lineTo(35.25f, 152.85f)
            }
        }.build()

        return _ChartDonutThin!!
    }

@Suppress("ObjectPropertyName")
private var _ChartDonutThin: ImageVector? = null
