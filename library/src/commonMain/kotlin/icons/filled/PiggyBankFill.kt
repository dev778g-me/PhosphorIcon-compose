package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PiggyBankFill: ImageVector
    get() {
        if (_PiggyBankFill != null) {
            return _PiggyBankFill!!
        }
        _PiggyBankFill = ImageVector.Builder(
            name = "Filled.PiggyBankFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(226f, 88.08f)
                curveToRelative(-0.4f, -1f, -0.82f, -2f, -1.25f, -3f)
                arcToRelative(87.93f, 87.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -30.17f, -37f)
                lineTo(216f, 48.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(112f, 32.08f)
                arcToRelative(88.12f, 88.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -87.72f, 81f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.57f, -14.16f)
                arcTo(87.69f, 87.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 46f, 178.22f)
                lineToRelative(12.56f, 35.16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 73.64f, 224f)
                lineTo(86.36f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.07f, -10.62f)
                lineToRelative(1.92f, -5.38f)
                horizontalLineToRelative(57.3f)
                lineToRelative(1.92f, 5.38f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 177.64f, 224f)
                horizontalLineToRelative(12.72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.07f, -10.62f)
                lineTo(221.64f, 168f)
                lineTo(224f, 168f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                lineTo(248f, 112f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 226f, 88.08f)
                close()
                moveTo(152f, 72f)
                lineTo(112f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(180f, 128f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180f, 128f)
                close()
            }
        }.build()

        return _PiggyBankFill!!
    }

@Suppress("ObjectPropertyName")
private var _PiggyBankFill: ImageVector? = null
