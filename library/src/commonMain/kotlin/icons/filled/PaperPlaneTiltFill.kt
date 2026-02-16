package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PaperPlaneTiltFill: ImageVector
    get() {
        if (_PaperPlaneTiltFill != null) {
            return _PaperPlaneTiltFill!!
        }
        _PaperPlaneTiltFill = ImageVector.Builder(
            name = "Filled.PaperPlaneTiltFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.4f, 44.34f)
                reflectiveCurveToRelative(0f, 0.1f, 0f, 0.15f)
                lineToRelative(-58.2f, 191.94f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14f, 11.51f)
                quadToRelative(-0.69f, 0.06f, -1.38f, 0.06f)
                arcToRelative(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.42f, -9.15f)
                lineTo(107f, 164.15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.77f, -4.58f)
                lineToRelative(57.92f, -57.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, -11.31f)
                lineTo(96.43f, 148.26f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.58f, 0.77f)
                lineTo(17.08f, 112.64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.49f, -29.8f)
                lineToRelative(191.94f, -58.2f)
                lineToRelative(0.15f, 0f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.4f, 44.34f)
                close()
            }
        }.build()

        return _PaperPlaneTiltFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaperPlaneTiltFill: ImageVector? = null
