package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.HurricaneThin: ImageVector
    get() {
        if (_HurricaneThin != null) {
            return _HurricaneThin!!
        }
        _HurricaneThin = ImageVector.Builder(
            name = "Thin.HurricaneThin",
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
                moveTo(128f, 128f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148.62f, 50.68f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 128f)
                curveToRelative(0f, 96f, -112f, 120f, -112f, 120f)
                lineToRelative(11.38f, -42.68f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 128f)
                curveTo(48f, 32f, 160f, 8f, 160f, 8f)
                close()
            }
        }.build()

        return _HurricaneThin!!
    }

@Suppress("ObjectPropertyName")
private var _HurricaneThin: ImageVector? = null
