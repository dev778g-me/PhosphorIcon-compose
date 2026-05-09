package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CigaretteSlashFill: ImageVector
    get() {
        if (_CigaretteSlashFill != null) {
            return _CigaretteSlashFill!!
        }
        _CigaretteSlashFill = ImageVector.Builder(
            name = "Filled.CigaretteSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(201f, 60.08f)
                curveToRelative(8f, -14.23f, 7.42f, -21.71f, 6.36f, -24.91f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.64f, -3.86f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, -14.62f)
                arcToRelative(22.57f, 22.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 13.44f)
                curveToRelative(3.36f, 10.14f, 0.81f, 22.85f, -7.6f, 37.79f)
                curveToRelative(-8f, 14.23f, -7.42f, 21.72f, -6.36f, 24.92f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.64f, 3.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.5f, 14.62f)
                arcToRelative(22.53f, 22.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -13.44f)
                curveTo(190.07f, 87.73f, 192.62f, 75f, 201f, 60.08f)
                close()
                moveTo(153.4f, 97.87f)
                arcToRelative(22.53f, 22.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 13.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.5f, -14.62f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.64f, -3.85f)
                curveToRelative(-1.06f, -3.2f, -1.64f, -10.69f, 6.36f, -24.92f)
                curveToRelative(8.41f, -14.94f, 11f, -27.65f, 7.6f, -37.79f)
                arcToRelative(22.57f, 22.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -13.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6.5f, 14.62f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 3.86f)
                curveToRelative(1.06f, 3.2f, 1.64f, 10.68f, -6.36f, 24.91f)
                curveTo(152.62f, 75f, 150.07f, 87.73f, 153.43f, 97.87f)
                close()
                moveTo(213.89f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineTo(175.37f, 192f)
                lineTo(32f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 144f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                horizontalLineToRelative(85.19f)
                lineTo(42.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.92f, 34.62f)
                close()
                moveTo(160.82f, 176f)
                lineToRelative(-29.09f, -32f)
                lineTo(96f, 144f)
                verticalLineToRelative(32f)
                close()
                moveTo(224f, 128f)
                lineTo(178.52f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 16f)
                lineTo(224f, 144f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-1.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 16f)
                lineTo(224f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(240f, 144f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 128f)
                close()
            }
        }.build()

        return _CigaretteSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _CigaretteSlashFill: ImageVector? = null
