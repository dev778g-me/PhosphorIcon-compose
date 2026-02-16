package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.FunctionThin: ImageVector
    get() {
        if (_FunctionThin != null) {
            return _FunctionThin!!
        }
        _FunctionThin = ImageVector.Builder(
            name = "Thin.FunctionThin",
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
                moveTo(72f, 128f)
                lineTo(184f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 216f)
                horizontalLineTo(85.29f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.49f, -26.28f)
                lineTo(139.22f, 66.28f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 170.71f, 40f)
                horizontalLineTo(200f)
            }
        }.build()

        return _FunctionThin!!
    }

@Suppress("ObjectPropertyName")
private var _FunctionThin: ImageVector? = null
