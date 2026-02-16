package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.FinnTheHumanBold: ImageVector
    get() {
        if (_FinnTheHumanBold != null) {
            return _FinnTheHumanBold!!
        }
        _FinnTheHumanBold = ImageVector.Builder(
            name = "Bold.FinnTheHumanBold",
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
                moveTo(96f, 108f)
                lineTo(160f, 108f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 148f)
                lineTo(200f, 148f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 188f)
                lineTo(96f, 188f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 148f)
                lineTo(56f, 148f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 108f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(96f, 148f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 148f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 72f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 0f)
                horizontalLineTo(188f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 0f)
                verticalLineToRelative(76f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -76f, 76f)
                horizontalLineTo(96f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -76f, -76f)
                close()
            }
        }.build()

        return _FinnTheHumanBold!!
    }

@Suppress("ObjectPropertyName")
private var _FinnTheHumanBold: ImageVector? = null
