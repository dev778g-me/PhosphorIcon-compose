package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HandDepositFill: ImageVector
    get() {
        if (_HandDepositFill != null) {
            return _HandDepositFill!!
        }
        _HandDepositFill = ImageVector.Builder(
            name = "Filled.HandDepositFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 198.65f)
                verticalLineTo(240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(198.65f)
                arcTo(74.84f, 74.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 144f)
                verticalLineToRelative(58.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.69f, 4.38f)
                lineToRelative(-10.68f, -16.31f)
                curveToRelative(-0.08f, -0.12f, -0.16f, -0.25f, -0.23f, -0.38f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.89f, 11.83f)
                lineToRelative(22.13f, 33.79f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.39f, 8.76f)
                lineToRelative(-22.26f, -34f)
                lineToRelative(-0.24f, -0.38f)
                curveToRelative(-0.38f, -0.66f, -0.73f, -1.33f, -1.05f, -2f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 80f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(80f)
                horizontalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(27.62f)
                arcTo(90.89f, 90.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 198.65f)
                close()
                moveTo(128f, 35.31f)
                lineToRelative(18.34f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                lineToRelative(-32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineToRelative(-32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 93.66f, 53.66f)
                lineTo(112f, 35.31f)
                verticalLineTo(80f)
                horizontalLineToRelative(16f)
                close()
            }
        }.build()

        return _HandDepositFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandDepositFill: ImageVector? = null
