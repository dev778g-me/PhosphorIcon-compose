package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.Sword: ImageVector
    get() {
        if (_Sword != null) {
            return _Sword!!
        }
        _Sword = ImageVector.Builder(
            name = "Regular.Sword",
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
                moveTo(42.35f, 127.03f)
                lineTo(55.03f, 114.35f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.36f, 114.35f)
                lineTo(141.65f, 189.63f)
                arcTo(8.01f, 8.01f, 90f, isMoreThanHalf = false, isPositiveArc = true, 141.65f, 200.96f)
                lineTo(128.96f, 213.65f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 117.63f, 213.65f)
                lineTo(42.35f, 138.36f)
                arcTo(8.01f, 8.01f, 90f, isMoreThanHalf = false, isPositiveArc = true, 42.35f, 127.03f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 96f)
                lineTo(104f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(68f, 164f)
                lineTo(34.34f, 197.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.31f)
                lineTo(47f, 221.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 0f)
                lineTo(92f, 188f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(82.44f, 130.43f)
                lineToRelative(69.56f, -90.43f)
                lineToRelative(64f, 0f)
                lineToRelative(0f, 64f)
                lineToRelative(-90.43f, 69.56f)
            }
        }.build()

        return _Sword!!
    }

@Suppress("ObjectPropertyName")
private var _Sword: ImageVector? = null
